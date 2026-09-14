#!/usr/bin/env python3
"""
폴더를 스캔해서 루트 README.md의 통계/문제 표를 다시 생성한다.
의존성 없음 (표준 라이브러리만 사용).

사용법:
    python scripts/update_readme.py
"""

from __future__ import annotations

import sys
from collections import Counter
from pathlib import Path
from urllib.parse import quote

ROOT = Path(__file__).resolve().parent.parent

START = "<!-- PS:START -->"
END = "<!-- PS:END -->"

PLATFORMS = [
    ("leetcode", "LeetCode"),
    ("programmers", "Programmers"),
]

LANG_BY_EXT = {
    ".py": "Python",
    ".java": "Java",
    ".swift": "Swift",
    ".cpp": "C++",
    ".cc": "C++",
    ".c": "C",
    ".js": "JavaScript",
    ".ts": "TypeScript",
    ".kt": "Kotlin",
    ".go": "Go",
    ".sql": "SQL",
    ".rb": "Ruby",
    ".rs": "Rust",
}

# 표에 풀이 링크를 나열할 순서 (주 언어 먼저)
LANG_PRIORITY = ["Python", "Java", "Swift", "Kotlin", "C++", "JavaScript", "TypeScript", "Go", "SQL"]


def parse_frontmatter(path: Path) -> dict | None:
    """README.md 상단의 --- ... --- 블록을 아주 단순한 규칙으로 파싱한다."""
    try:
        text = path.read_text(encoding="utf-8")
    except OSError:
        return None

    lines = text.splitlines()
    if not lines or lines[0].strip() != "---":
        return None

    data: dict = {}
    for line in lines[1:]:
        stripped = line.strip()
        if stripped == "---":
            break
        if not stripped or stripped.startswith("#"):
            continue
        if ":" not in stripped:
            continue
        key, _, raw = stripped.partition(":")
        key = key.strip()
        value = raw.strip()

        # 인라인 리스트: [a, b, c]
        if value.startswith("[") and value.endswith("]"):
            inner = value[1:-1]
            items = [v.strip().strip("'\"") for v in inner.split(",")]
            data[key] = [v for v in items if v]
        else:
            data[key] = value.strip("'\"")
    return data


def find_solutions(folder: Path) -> list[tuple[str, Path]]:
    """문제 폴더 안의 풀이 파일들을 (언어, 경로)로 반환."""
    found = []
    for child in sorted(folder.iterdir()):
        if not child.is_file():
            continue
        if child.name.lower() == "readme.md":
            continue
        lang = LANG_BY_EXT.get(child.suffix.lower())
        if lang:
            found.append((lang, child))

    def priority(item: tuple[str, Path]) -> tuple[int, str]:
        lang = item[0]
        rank = LANG_PRIORITY.index(lang) if lang in LANG_PRIORITY else len(LANG_PRIORITY)
        return (rank, lang)

    return sorted(found, key=priority)


def collect(platform_dir: Path) -> list[dict]:
    """플랫폼 폴더 아래의 모든 문제를 수집한다 (하위 깊이 무관)."""
    problems = []
    if not platform_dir.is_dir():
        return problems

    for readme in sorted(platform_dir.rglob("README.md")):
        meta = parse_frontmatter(readme)
        if not meta:
            continue
        folder = readme.parent
        meta["_folder"] = folder
        meta["_solutions"] = find_solutions(folder)
        problems.append(meta)
    return problems


def rel_link(path: Path) -> str:
    """루트 기준 상대경로를 마크다운 링크용으로 인코딩."""
    rel = path.relative_to(ROOT).as_posix()
    return quote(rel)


def sort_key(p: dict) -> tuple:
    raw_id = str(p.get("id", "0"))
    try:
        num = int(raw_id)
    except ValueError:
        num = 0
    return (num, str(p.get("title", "")))


def render_table(problems: list[dict]) -> str:
    if not problems:
        return "_아직 등록된 문제가 없습니다._\n"

    out = ["| # | 문제 | 난이도 | 유형 | 풀이 | 글 |", "|---|---|---|---|---|---|"]

    for p in sorted(problems, key=sort_key):
        pid = p.get("id", "-")
        title = p.get("title", p["_folder"].name)
        url = p.get("url", "")
        title_cell = f"[{title}]({url})" if url else title

        difficulty = p.get("difficulty", "-")

        tags = p.get("tags", [])
        if isinstance(tags, str):
            tags = [tags] if tags else []
        tags_cell = ", ".join(tags) if tags else "-"

        sols = p.get("_solutions", [])
        if sols:
            sol_cell = " · ".join(f"[{lang}]({rel_link(path)})" for lang, path in sols)
        else:
            sol_cell = "-"

        velog = p.get("velog", "")
        velog_cell = f"[글]({velog})" if velog else "-"

        out.append(f"| {pid} | {title_cell} | {difficulty} | {tags_cell} | {sol_cell} | {velog_cell} |")

    return "\n".join(out) + "\n"


def render_stats(by_platform: dict[str, list[dict]]) -> str:
    total = sum(len(v) for v in by_platform.values())

    lines = []
    counts = " · ".join(
        f"{label} {len(by_platform[key])}"
        for key, label in PLATFORMS
        if by_platform.get(key)
    )
    lines.append(f"**총 {total}문제**" + (f" — {counts}" if counts else ""))
    lines.append("")

    # 유형별 집계
    tag_counter: Counter[str] = Counter()
    lang_counter: Counter[str] = Counter()
    for problems in by_platform.values():
        for p in problems:
            tags = p.get("tags", [])
            if isinstance(tags, str):
                tags = [tags] if tags else []
            tag_counter.update(tags)
            lang_counter.update(lang for lang, _ in p.get("_solutions", []))

    if tag_counter:
        top = " · ".join(f"{tag} {n}" for tag, n in tag_counter.most_common(12))
        lines.append(f"**유형별** — {top}")
        lines.append("")

    if lang_counter:
        langs = " · ".join(f"{lang} {n}" for lang, n in lang_counter.most_common())
        lines.append(f"**언어별** — {langs}")
        lines.append("")

    return "\n".join(lines)


def main() -> int:
    by_platform = {key: collect(ROOT / key) for key, _ in PLATFORMS}

    sections = [render_stats(by_platform)]
    for key, label in PLATFORMS:
        sections.append(f"## {label}")
        sections.append("")
        sections.append(render_table(by_platform[key]))

    body = "\n".join(sections).rstrip() + "\n"

    readme_path = ROOT / "README.md"
    text = readme_path.read_text(encoding="utf-8")

    if START not in text or END not in text:
        print(f"[오류] README.md에 {START} / {END} 마커가 없습니다.", file=sys.stderr)
        return 1

    before = text.split(START)[0]
    after = text.split(END)[1]
    new_text = f"{before}{START}\n\n{body}\n{END}{after}"

    if new_text == text:
        print("변경 없음.")
        return 0

    readme_path.write_text(new_text, encoding="utf-8")
    total = sum(len(v) for v in by_platform.values())
    print(f"README.md 갱신 완료 — {total}문제")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
