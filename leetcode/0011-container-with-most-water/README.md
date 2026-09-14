---
platform: leetcode
id: 11
title: Container With Most Water
url: https://leetcode.com/problems/container-with-most-water/
difficulty: Medium
tags: [투 포인터, 그리디]
velog:
solved: 2026-09-14
---

# Container With Most Water

> 구조 확인용 예시 폴더입니다. 첫 문제를 추가한 뒤 삭제하세요.

## 문제 요약

높이 배열 `height`가 주어진다. 두 막대를 골라 물을 담을 때 담을 수 있는 최대 면적을 구한다.
면적은 `(두 인덱스 차이) × min(두 높이)`.

## 접근

- 모든 쌍을 보면 O(n²). n이 10⁵까지라 불가능.
- 양 끝에서 좁혀오는 투 포인터. 면적은 **더 낮은 쪽 높이**에 갇혀 있으므로, 낮은 쪽을 옮길 때만 면적이 커질 가능성이 생긴다.
- 높은 쪽을 옮기면 폭은 줄고 높이 상한은 그대로거나 낮아지니 무조건 손해 → 낮은 쪽만 이동.

## 복잡도

- 시간: O(n) — 포인터가 각각 한 방향으로만 이동
- 공간: O(1)

## 배운 점 / 막힌 지점

- "왜 낮은 쪽을 옮기는 게 안전한가"를 말로 설명할 수 있어야 투 포인터를 제대로 쓴 것. 처음엔 감으로 맞췄다.
