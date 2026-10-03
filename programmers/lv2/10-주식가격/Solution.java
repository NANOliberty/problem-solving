class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = prices.length - 1; i >= 0; i--) {             
            answer[prices.length - i - 1] = i;         
        }
        
        int distance = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        
        return answer;
    }
}