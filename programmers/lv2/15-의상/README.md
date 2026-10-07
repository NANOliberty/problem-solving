---
platform: programmers
id: 15
title: 의상
url: https://school.programmers.co.kr/learn/courses/30/lessons/15
difficulty: lv2
tags: [해시]
velog:
solved: 2026-10-07
---

# 의상

## 문제 요약

<!-- 지문 전문 복붙 대신 2~3줄 요약 + 위 링크로 -->

## 접근

-

## 복잡도

- 시간: O()
- 공간: O()

## 배운 점 / 막힌 지점

- 아래의 경우를 상정하고 조합 식을 계산해 봤는데...
h -> 2
e -> 1
f -> 1

nCr = nPr/r! = n!/r!(n-r)!

  1          2             3
(4C1) + (3C2 + 2C1) + (3C3 + 2C1) = 4 + 5 + 2 = 11

생각해보니 경우의 수에서 해당 종류의 옷을 입지 않는 경우까지 + 1하고 나중에 아무것도 안 입는 경우 빼주면 될 듯

(h + 1) + (e + 1) + (f + 1) - 1 = 3 * 2 * 2 - 1 = 11
