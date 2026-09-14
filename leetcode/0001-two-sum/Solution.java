class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }     
        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (map.containsKey(com) && map.get(com) != i) { // check if the complement exists and is not the same index
                return new int[] {i, map.get(com)};
            }
        }
        return new int[]{};
    }
}

// [Hash Map] time complexity: O(n)  space complexity: O(n)