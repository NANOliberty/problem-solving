# problem-solving

LeetCode / Programmers 문제 풀이 기록
<p> SQL 정리한 글은 [벨로그](https://velog.io/@NANOliberty)

**주 언어는 Java / Python**

<br>

---

<br>

## 구조

```
problem-solving/
├── leetcode/
│   └── 0011-container-with-most-water/
│       ├── README.md        # 프론트매터(메타) + 접근 과정
│       ├── solution.py
│       └── Solution.java    # 서브 언어 풀이
├── programmers/
│   └── lv2/
│       └── 42586-기능개발/
│           ├── README.md
│           └── solution.py
└── scripts/
    ├── new_problem.py       # 문제 폴더 생성
    └── update_readme.py     # 아래 표 자동 갱신
```

LeetCode는 번호를 4자리로 채워(`0011-`) 정렬을 맞추고, Programmers는 레벨 폴더로 한 번 분할


<br>

## 사용법

새 문제 추가:

```bash
python3 scripts/new_problem.py leetcode 1 "Two Sum" -d Easy -t "해시"
python3 scripts/new_problem.py programmers 1 "기능개발" -d lv2 -t "큐,시뮬레이션" -l py,java
```

풀이를 작성한 뒤 표 갱신:

```bash
python3 scripts/update_readme.py
```

`update_readme.py`는 문제 폴더의 `README.md` 프론트매터를 읽어 아래 표와 통계를 다시 제작
벨로그 글을 쓰면 해당 문제 README의 `velog:` 항목에 링크만 채우고 스크립트를 다시

---

<!-- PS:START -->

**총 10문제** — LeetCode 4 · Programmers 6

**유형별** — 정렬 5 · 해시 2 · 연결리스트 1 · 연습문제 1 · 2019 KAKAO BLIND RECRUITMENT 1

**언어별** — Python 10 · Java 10

## LeetCode

| # | 문제 | 난이도 | 유형 | 풀이 | 글 |
|---|---|---|---|---|---|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | 해시 | [Python](leetcode/0001-two-sum/solution.py) · [Java](leetcode/0001-two-sum/Solution.java) | - |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Med. | 연결리스트 | [Python](leetcode/0002-add-two-numbers/solution.py) · [Java](leetcode/0002-add-two-numbers/Solution.java) | - |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Med. | 계수 정렬 | [Python](leetcode/0075-sort-colors/solution.py) · [Java](leetcode/0075-sort-colors/Solution.java) | - |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | 정렬 | [Python](leetcode/0088-merge-sorted-array/solution.py) · [Java](leetcode/0088-merge-sorted-array/Solution.java) | - |

## Programmers

| # | 문제 | 난이도 | 유형 | 풀이 | 글 |
|---|---|---|---|---|---|
| 1 | [완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/1) | lv1 | 해시 | [Python](programmers/lv1/1-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98/solution.py) · [Java](programmers/lv1/1-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98/Solution.java) | - |
| 2 | [K번째수](https://school.programmers.co.kr/learn/courses/30/lessons/2) | lv1 | 정렬 | [Python](programmers/lv1/2-K%EB%B2%88%EC%A7%B8%EC%88%98/solution.py) · [Java](programmers/lv1/2-K%EB%B2%88%EC%A7%B8%EC%88%98/Solution.java) | - |
| 3 | [가장 큰 수](https://school.programmers.co.kr/learn/courses/30/lessons/2) | lv2 | 정렬 | [Python](programmers/lv2/3-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%88%98/solution.py) · [Java](programmers/lv2/3-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%88%98/Solution.java) | - |
| 4 | [H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/4) | lv2 | 정렬 | [Python](programmers/lv2/4-h-index/solution.py) · [Java](programmers/lv2/4-h-index/Solution.java) | - |
| 5 | [문자열 내 마음대로 정렬하기](https://school.programmers.co.kr/learn/courses/30/lessons/5) | lv1 | 연습문제 | [Python](programmers/lv1/5-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%82%B4-%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0/solution.py) · [Java](programmers/lv1/5-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%82%B4-%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0/Solution.java) | - |
| 6 | [실패율](https://school.programmers.co.kr/learn/courses/30/lessons/6) | lv1 | 2019 KAKAO BLIND RECRUITMENT | [Python](programmers/lv1/6-%EC%8B%A4%ED%8C%A8%EC%9C%A8/solution.py) · [Java](programmers/lv1/6-%EC%8B%A4%ED%8C%A8%EC%9C%A8/Solution.java) | - |

<!-- PS:END -->
