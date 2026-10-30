---
platform: leetcode
id: 78
title: Subsets
url: https://leetcode.com/problems/subsets/
difficulty: Med.
tags: [Backtracking]
velog:
solved: 2026-10-29
---

# Subsets

## 문제 요약

<!-- 지문 전문 복붙 대신 2~3줄 요약 + 위 링크로 -->

## 접근

-

## 복잡도

- 시간: O()
- 공간: O()

## 배운 점 / 막힌 지점

- 순열 및 조합 코드, 앞으로는 visited 말고 List 2개로 해결을 해야겠다.
void perm(List<Integer> temp, List<Integer> rest) {
    if (!temp.isEmpty()) subset.add(temp);
    for (int i = 0; i < rest.size(); i++) {
        List<Integer> nextCur = new ArrayList<>(temp);
        nextCur.add(rest.get(i));
        List<Integer> nextRest = new ArrayList<>(rest);
        nextRest.remove(i);
        perm(nextCur, nextRest);
    }
}

void comb(List<Integer> cur, List<Integer> rest) {
    if (!cur.isEmpty()) subset.add(cur);

    for (int i = 0; i < rest.size(); i++) {
        List<Integer> nextCur = new ArrayList<>(cur);
        nextCur.add(rest.get(i));
        List<Integer> nextRest = new ArrayList<>(rest.subList(i + 1, rest.size()));
        comb(nextCur, nextRest);
    }
}