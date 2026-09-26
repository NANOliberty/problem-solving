---
platform: leetcode
id: 179
title: Largest Number
url: https://leetcode.com/problems/largest-number/
difficulty: Med.
tags: [정렬]
velog:
solved: 2026-09-26
---

# Largest Number

## 문제 요약

<!-- 지문 전문 복붙 대신 2~3줄 요약 + 위 링크로 -->

## 접근

- Arrays.sort(strs, (a, b) -> (b+a).compareTo(a+b)); 사용하는 문제

## 복잡도

- 시간: O(n log n)
- 공간: O()

## 배운 점 / 막힌 지점

- 시간복잡도가 괜찮긴 한데, answer.startsWith("0")이것보다는 strs[0].equals("0") 쓰고,
        다음에는 아래처럼 StringBuilder를 써야 8ms에서 6ms로 단축 가능할 듯
        ```java
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }

        return sb.toString();
        ```