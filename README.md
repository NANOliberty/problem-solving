# problem-solving

LeetCode · Programmers 문제 풀이 기록
각 문제 폴더에 풀이 코드와 접근 과정을 함께 남기고, 정리한 글은 [벨로그](https://velog.io/@NANOliberty)

**주 언어는 Python / Java**

---

## 구조

```
problem-solving/
├── leetcode/
│   └── 0011-container-with-most-water/
│       ├── README.md        # 프론트매터(메타) + 접근 과정
│       ├── solution.py
│       └── Solution.java    # 서브 언어 풀이가 있으면 같은 폴더에
├── programmers/
│   └── lv2/
│       └── 42586-기능개발/
│           ├── README.md
│           └── solution.py
└── scripts/
    ├── new_problem.py       # 문제 폴더 생성
    └── update_readme.py     # 아래 표 자동 갱신
```

LeetCode는 번호를 4자리로 채워(`0011-`) 정렬을 맞추고, Programmers는 레벨 폴더로 한 번 나눕니다.

## 사용법

새 문제 추가:

```bash
python scripts/new_problem.py leetcode 11 "Container With Most Water" -d Medium -t "투 포인터,그리디"
python scripts/new_problem.py programmers 42586 "기능개발" -d lv2 -t "큐,시뮬레이션" -l py,java
```

풀이를 작성한 뒤 표 갱신:

```bash
python scripts/update_readme.py
```

`update_readme.py`는 문제 폴더의 `README.md` 프론트매터를 읽어 아래 표와 통계를 다시 제작
벨로그 글을 쓰면 해당 문제 README의 `velog:` 항목에 링크만 채우고 스크립트를 다시 돌림

---

<!-- PS:START -->

**총 3문제** — LeetCode 3

**유형별** — 해시 1 · 연결리스트 1 · 투 포인터 1 · 그리디 1

**언어별** — Python 3 · Java 2

## LeetCode

| # | 문제 | 난이도 | 유형 | 풀이 | 글 |
|---|---|---|---|---|---|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | 해시 | [Python](leetcode/0001-two-sum/solution.py) · [Java](leetcode/0001-two-sum/Solution.java) | - |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Med. | 연결리스트 | [Python](leetcode/0002-add-two-numbers/solution.py) · [Java](leetcode/0002-add-two-numbers/Solution.java) | - |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | 투 포인터, 그리디 | [Python](leetcode/0011-container-with-most-water/solution.py) | - |

## Programmers

_아직 등록된 문제가 없습니다._

<!-- PS:END -->
