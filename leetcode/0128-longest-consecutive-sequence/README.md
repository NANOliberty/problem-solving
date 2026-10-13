---
platform: leetcode
id: 128
title: Longest Consecutive Sequence
url: https://leetcode.com/problems/longest-consecutive-sequence/
difficulty: Med.
tags: [HashSet]
velog:
solved: 2026-10-13
---

# Longest Consecutive Sequence

## 문제 요약

<!-- 지문 전문 복붙 대신 2~3줄 요약 + 위 링크로 -->

## 접근

-

## 복잡도

- 시간: O()
- 공간: O()

## 배운 점 / 막힌 지점

- 집합(HashSet)을 이용하는 문제였다. 핵심은 set.contaions(x)였던 것 같다. 헤드 값을 찾은 후, while 반복문을 통해 max_length의 값을 이용해서 answer를 갱신시키는 방식으로 풀었다.
