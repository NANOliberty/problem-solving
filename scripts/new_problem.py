#!/usr/bin/env python3
"""
새 문제 폴더를 만들고 README 프론트매터 + 빈 풀이 파일을 생성한다.
의존성 없음.

사용 예:
    python scripts/new_problem.py leetcode 11 "Container With Most Water" \
        -d Medium -t "투 포인터,그리디"

    python scripts/new_problem.py programmers 42586 "기능개발" \
        -d lv2 -t "큐,시뮬레이션" -l py,java
"""

from __future__ import annotations

import argparse
import datetime
import re
import unicodedata
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent

TEMPLATE_BY_EXT = {
    ".py": "",
    ".java": "class Solution {\n\n}\n",
    ".swift": "",
    ".js": "",
    ".kt": "",
    ".cpp": "#include <vector>\nusing namespace std;\n\nclass Solution {\npublic:\n\n};\n",
}


def slugify(title: str) -> str:
    """영문은 소문자-하이픈, 한글은 그대로 두고 공백만 하이픈으로."""
    text = unicodedata.normalize("NFC", title).strip()
    text = re.sub(r"[^\w\s가-힣-]", "", text)
    text = re.sub(r"[\s_]+", "-", text)
    if re.fullmatch(r"[A-Za-z0-9\-]+", text):
        text = text.lower()
    return text.strip("-")


def default_url(platform: str, pid: str, title: str) -> str:
    if platform == "leetcode":
        return f"https://leetcode.com/problems/{slugify(title).lower()}/"
    if platform == "programmers":
        return f"https://school.programmers.co.kr/learn/courses/30/lessons/{pid}"
    return ""


def target_folder(platform: str, pid: str, title: str, difficulty: str) -> Path:
    slug = slugify(title)
    if platform == "leetcode":
        return ROOT / "leetcode" / f"{int(pid):04d}-{slug}"
    if platform == "programmers":
        level = difficulty.lower() if re.fullmatch(r"lv[1-5]", difficulty.lower()) else "etc"
        return ROOT / "programmers" / level / f"{pid}-{slug}"
    return ROOT / platform / f"{pid}-{slug}"


def build_readme(platform: str, pid: str, title: str, url: str, difficulty: str, tags: list[str]) -> str:
    tag_line = "[" + ", ".join(tags) + "]" if tags else "[]"
    today = datetime.date.today().isoformat()
    return f"""---
platform: {platform}
id: {pid}
title: {title}
url: {url}
difficulty: {difficulty}
tags: {tag_line}
velog:
solved: {today}
---

# {title}

## 문제 요약

<!-- 지문 전문 복붙 대신 2~3줄 요약 + 위 링크로 -->

## 접근

-

## 복잡도

- 시간: O()
- 공간: O()

## 배운 점 / 막힌 지점

-
"""


def main() -> int:
    parser = argparse.ArgumentParser(description="새 문제 폴더 생성")
    parser.add_argument("platform", choices=["leetcode", "programmers"])
    parser.add_argument("id", help="문제 번호")
    parser.add_argument("title", help="문제 제목")
    parser.add_argument("-d", "--difficulty", default="", help="Easy/Medium/Hard 또는 lv1~lv5")
    parser.add_argument("-t", "--tags", default="", help="쉼표로 구분 (예: \"투 포인터,그리디\")")
    parser.add_argument("-u", "--url", default="", help="비우면 자동 생성")
    parser.add_argument("-l", "--langs", default="py", help="풀이 파일 확장자, 쉼표 구분 (기본 py)")
    args = parser.parse_args()

    tags = [t.strip() for t in args.tags.split(",") if t.strip()]
    url = args.url or default_url(args.platform, args.id, args.title)
    folder = target_folder(args.platform, args.id, args.title, args.difficulty)

    if folder.exists():
        print(f"[중단] 이미 존재하는 폴더입니다: {folder.relative_to(ROOT)}")
        return 1

    folder.mkdir(parents=True)
    (folder / "README.md").write_text(
        build_readme(args.platform, args.id, args.title, url, args.difficulty or "-", tags),
        encoding="utf-8",
    )

    for raw in args.langs.split(","):
        ext = "." + raw.strip().lstrip(".")
        if not ext or ext == ".":
            continue
        name = "Solution" + ext if ext == ".java" else "solution" + ext
        (folder / name).write_text(TEMPLATE_BY_EXT.get(ext, ""), encoding="utf-8")

    print(f"생성 완료: {folder.relative_to(ROOT)}")
    print("풀이 작성 후 → python scripts/update_readme.py")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
