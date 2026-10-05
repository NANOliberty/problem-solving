---
platform: leetcode
id: 739
title: Daily Temperatures
url: https://leetcode.com/problems/daily-temperatures/
difficulty: Med.
tags: [Stack]
velog:
solved: 2026-10-05
---

# Daily Temperatures

## 문제 요약

<!-- 지문 전문 복붙 대신 2~3줄 요약 + 위 링크로 -->

## 접근

-

## 복잡도

- 시간: O()
- 공간: O()

## 배운 점 / 막힌 지점

- monotonic decreasing stack, 모노토닉 스택 (단조 감소 스택) 문제이다. 브루트포스로 O(n**2)으로 푸니까 시간 초과나서... 결국 스택으로 풀게 된 문제인데, 스택에 아직 답을 못 찾은 날의 인덱스를 쌓아두면 무려 O(n)으로 단축된다. 한 번 더 풀어야 할 듯.