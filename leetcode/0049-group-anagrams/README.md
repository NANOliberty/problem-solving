---
platform: leetcode
id: 49
title: Group Anagrams
url: https://leetcode.com/problems/group-anagrams/
difficulty: Med.
tags: [Sorting]
velog:
solved: 2026-10-10
---

# Group Anagrams

## 문제 요약

<!-- 지문 전문 복붙 대신 2~3줄 요약 + 위 링크로 -->

## 접근

-

## 복잡도

- 시간: O()
- 공간: O()

## 배운 점 / 막힌 지점

- List<List<String>> answer = new ArrayList<>(map.values()); 이거 쓰니까 1ms 빨라졌다!
• String.valueOf(배열) / new String(배열)
	• toCharArray()의 반대 / char[] 배열을 다시 하나의 String 문자열로 합칠 때 사용
• Arrays.asList(배열) / List.of(배열)
	• toArray()의 반대 / 일반 배열(String[])을 List<String>으로 바꿀 때 사용
• Integer.parseInt(문자열) / Double.parseDouble(문자열)
	• "123" 같은 숫자 모양의 문자열을 진짜 숫자 타입(int, double)으로 바꿀 때 사용
