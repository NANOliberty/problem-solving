class Solution {
    boolean[] visited;
    List<List<Integer>> subset;

    public List<List<Integer>> subsets(int[] nums) {
        subset = new ArrayList<>();
        visited = new boolean[nums.length];

        subset.add(new ArrayList<>());

        List<Integer> numList = new ArrayList<>();
        for (int i : nums) numList.add(i);

        comb(new ArrayList<>(), numList);

        return subset;
    }

    // void perm(List<Integer> temp, List<Integer> rest) {
    //     if (!temp.isEmpty()) subset.add(temp);
    //     for (int i = 0; i < rest.size(); i++) {
    //         List<Integer> nextCur = new ArrayList<>(temp);
    //         nextCur.add(rest.get(i));
    //         List<Integer> nextRest = new ArrayList<>(rest);
    //         nextRest.remove(i);
    //         perm(nextCur, nextRest);
    //     }
    // }

    void comb(List<Integer> cur, List<Integer> rest) {
        if (!cur.isEmpty()) subset.add(cur);

        for (int i = 0; i < rest.size(); i++) {
            List<Integer> nextCur = new ArrayList<>(cur);
            nextCur.add(rest.get(i));
            List<Integer> nextRest = new ArrayList<>(rest.subList(i + 1, rest.size()));
            comb(nextCur, nextRest);
        }
    }
}