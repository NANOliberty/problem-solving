class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        if (nums.length == 0) return 0;
        for (int i : nums) set.add(i);

        int answer = 1;
        int max_length = 1;
        for (int i : set) {
            if (!set.contains(i-1)) {
                int start = i;
                max_length = 1;
                while(set.contains(start+1)) {
                    max_length++;
                    answer = (answer < max_length) ? max_length : answer;
                    start++;
                }
            }
        }
        return answer;
    }
}