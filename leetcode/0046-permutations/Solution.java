class Solution {
    List<List<Integer>> answer;
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        answer = new ArrayList<>();
        visited = new boolean[nums.length];
        perm(0, nums, new ArrayList<>());

        return answer;
    }

    void perm(int r, int[] arr, List<Integer> cur) {
        if (arr.length == r) answer.add(new ArrayList<>(cur));
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                cur.add(arr[i]);
                perm(r + 1, arr, cur);
                cur.remove(cur.size()-1);
                visited[i] = false;
            }
        }
    }
}