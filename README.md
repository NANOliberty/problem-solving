# problem-solving

LeetCode / Programmers 문제 풀이 기록

치트 시트는 [Java 코딩테스트 치트시트](https://velog.io/@nano_o/Java-코딩테스트-치트시트), 언어 정리는 [Java vs Python](https://velog.io/@nano_o/series/알고리즘-Cheat-Sheet)

SQL 정리한 글은 [벨로그](https://velog.io/@nano_o/series/SQL-고득점-Kit)

**주 언어는 Java / Python**

<br>

---

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

<br>

---

<!-- PS:START -->

**총 29문제** — LeetCode 13 · Programmers 16

**유형별** — 정렬 7 · 해시 5 · 스택/큐 5 · Stack 3 · Sorting 3 · 연결리스트 1 · Two Pointers 1 · 연습문제 1 · 2019 KAKAO BLIND RECRUITMENT 1 · 힙 1 · 완전탐색 1

**언어별** — Java 29 · Python 25

## LeetCode

| # | 문제 | 난이도 | 유형 | 풀이 | 글 |
|---|---|---|---|---|---|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | 해시 | [Python](leetcode/0001-two-sum/solution.py) · [Java](leetcode/0001-two-sum/Solution.java) | - |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Med. | 연결리스트 | [Python](leetcode/0002-add-two-numbers/solution.py) · [Java](leetcode/0002-add-two-numbers/Solution.java) | - |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | Stack | [Python](leetcode/0020-valid-parentheses/solution.py) · [Java](leetcode/0020-valid-parentheses/Solution.java) | - |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Med. | Sorting | [Java](leetcode/0049-group-anagrams/Solution.java) | - |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Med. | 정렬 | [Python](leetcode/0075-sort-colors/solution.py) · [Java](leetcode/0075-sort-colors/Solution.java) | - |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | 정렬 | [Python](leetcode/0088-merge-sorted-array/solution.py) · [Java](leetcode/0088-merge-sorted-array/Solution.java) | - |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | Two Pointers | [Python](leetcode/0125-valid-palindrome/solution.py) · [Java](leetcode/0125-valid-palindrome/Solution.java) | - |
| 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | Med. | Stack | [Java](leetcode/0155-min-stack/Solution.java) | - |
| 179 | [Largest Number](https://leetcode.com/problems/largest-number/) | Med. | 정렬 | [Python](leetcode/0179-largest-number/solution.py) · [Java](leetcode/0179-largest-number/Solution.java) | - |
| 215 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Med. | Sorting | [Java](leetcode/0215-kth-largest-element-in-an-array/Solution.java) | - |
| 347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Med. | Sorting | [Java](leetcode/0347-top-k-frequent-elements/Solution.java) | - |
| 451 | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) | Med. | 정렬 | [Python](leetcode/0451-sort-characters-by-frequency/solution.py) · [Java](leetcode/0451-sort-characters-by-frequency/Solution.java) | - |
| 739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Med. | Stack | [Python](leetcode/0739-daily-temperatures/solution.py) · [Java](leetcode/0739-daily-temperatures/Solution.java) | - |

## Programmers

| # | 문제 | 난이도 | 유형 | 풀이 | 글 |
|---|---|---|---|---|---|
| 1 | [완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/1) | lv1 | 해시 | [Python](programmers/lv1/1-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98/solution.py) · [Java](programmers/lv1/1-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98/Solution.java) | - |
| 2 | [K번째수](https://school.programmers.co.kr/learn/courses/30/lessons/2) | lv1 | 정렬 | [Python](programmers/lv1/2-K%EB%B2%88%EC%A7%B8%EC%88%98/solution.py) · [Java](programmers/lv1/2-K%EB%B2%88%EC%A7%B8%EC%88%98/Solution.java) | - |
| 3 | [가장 큰 수](https://school.programmers.co.kr/learn/courses/30/lessons/2) | lv2 | 정렬 | [Python](programmers/lv2/3-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%88%98/solution.py) · [Java](programmers/lv2/3-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%88%98/Solution.java) | - |
| 4 | [H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/4) | lv2 | 정렬 | [Python](programmers/lv2/4-h-index/solution.py) · [Java](programmers/lv2/4-h-index/Solution.java) | - |
| 5 | [문자열 내 마음대로 정렬하기](https://school.programmers.co.kr/learn/courses/30/lessons/5) | lv1 | 연습문제 | [Python](programmers/lv1/5-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%82%B4-%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0/solution.py) · [Java](programmers/lv1/5-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%82%B4-%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0/Solution.java) | - |
| 6 | [실패율](https://school.programmers.co.kr/learn/courses/30/lessons/6) | lv1 | 2019 KAKAO BLIND RECRUITMENT | [Python](programmers/lv1/6-%EC%8B%A4%ED%8C%A8%EC%9C%A8/solution.py) · [Java](programmers/lv1/6-%EC%8B%A4%ED%8C%A8%EC%9C%A8/Solution.java) | - |
| 7 | [기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/7) | lv2 | 스택/큐 | [Python](programmers/lv2/7-%EA%B8%B0%EB%8A%A5%EA%B0%9C%EB%B0%9C/solution.py) · [Java](programmers/lv2/7-%EA%B8%B0%EB%8A%A5%EA%B0%9C%EB%B0%9C/Solution.java) | - |
| 8 | [프로세스](https://school.programmers.co.kr/learn/courses/30/lessons/8) | lv2 | 스택/큐 | [Python](programmers/lv2/8-%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4/solution.py) · [Java](programmers/lv2/8-%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4/Solution.java) | - |
| 9 | [다리를 지나는 트럭](https://school.programmers.co.kr/learn/courses/30/lessons/9) | lv2 | 스택/큐 | [Python](programmers/lv2/9-%EB%8B%A4%EB%A6%AC%EB%A5%BC-%EC%A7%80%EB%82%98%EB%8A%94-%ED%8A%B8%EB%9F%AD/solution.py) · [Java](programmers/lv2/9-%EB%8B%A4%EB%A6%AC%EB%A5%BC-%EC%A7%80%EB%82%98%EB%8A%94-%ED%8A%B8%EB%9F%AD/Solution.java) | - |
| 10 | [주식가격](https://school.programmers.co.kr/learn/courses/30/lessons/10) | lv2 | 스택/큐 | [Python](programmers/lv2/10-%EC%A3%BC%EC%8B%9D%EA%B0%80%EA%B2%A9/solution.py) · [Java](programmers/lv2/10-%EC%A3%BC%EC%8B%9D%EA%B0%80%EA%B2%A9/Solution.java) | - |
| 11 | [베스트앨범](https://school.programmers.co.kr/learn/courses/30/lessons/11) | lv3 | 해시 | [Python](programmers/lv2/11-%EB%B2%A0%EC%8A%A4%ED%8A%B8%EC%95%A8%EB%B2%94/solution.py) · [Java](programmers/lv2/11-%EB%B2%A0%EC%8A%A4%ED%8A%B8%EC%95%A8%EB%B2%94/Solution.java) | - |
| 12 | [올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12) | lv2 | 스택/큐 | [Python](programmers/lv2/12-%EC%98%AC%EB%B0%94%EB%A5%B8-%EA%B4%84%ED%98%B8/solution.py) · [Java](programmers/lv2/12-%EC%98%AC%EB%B0%94%EB%A5%B8-%EA%B4%84%ED%98%B8/Solution.java) | - |
| 13 | [더 맵게](https://school.programmers.co.kr/learn/courses/30/lessons/13) | lv2 | 힙 | [Python](programmers/lv2/13-%EB%8D%94-%EB%A7%B5%EA%B2%8C/solution.py) · [Java](programmers/lv2/13-%EB%8D%94-%EB%A7%B5%EA%B2%8C/Solution.java) | - |
| 14 | [전화번호 목록](https://school.programmers.co.kr/learn/courses/30/lessons/14) | lv2 | 해시 | [Python](programmers/lv2/14-%EC%A0%84%ED%99%94%EB%B2%88%ED%98%B8-%EB%AA%A9%EB%A1%9D/solution.py) · [Java](programmers/lv2/14-%EC%A0%84%ED%99%94%EB%B2%88%ED%98%B8-%EB%AA%A9%EB%A1%9D/Solution.java) | - |
| 15 | [의상](https://school.programmers.co.kr/learn/courses/30/lessons/15) | lv2 | 해시 | [Python](programmers/lv2/15-%EC%9D%98%EC%83%81/solution.py) · [Java](programmers/lv2/15-%EC%9D%98%EC%83%81/Solution.java) | - |
| 16 | [모의고사](https://school.programmers.co.kr/learn/courses/30/lessons/16) | lv2 | 완전탐색 | [Python](programmers/lv2/16-%EB%AA%A8%EC%9D%98%EA%B3%A0%EC%82%AC/solution.py) · [Java](programmers/lv2/16-%EB%AA%A8%EC%9D%98%EA%B3%A0%EC%82%AC/Solution.java) | - |

<!-- PS:END -->
