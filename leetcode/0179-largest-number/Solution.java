class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        String answer = "";
        for(int i = 0; i < nums.length; i++)
            strs[i] = Integer.toString(nums[i]);

        Arrays.sort(strs, (a, b) -> ((b+a).compareTo(a+b)));
        for (String str : strs) answer += str;
        
        if (answer.startsWith("0")) return "0";
        return answer;
    }
}