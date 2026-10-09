import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] rate = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) rate[0]++;
            if (answers[i] == two[i % two.length]) rate[1]++;
            if (answers[i] == three[i % three.length]) rate[2]++;
        }
        
        int max_value = Math.max(rate[0], Math.max(rate[1], rate[2]));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rate.length; i++) {
            if (rate[i] == max_value) result.add(i+1);
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = result.get(i);
        
        return answer;
    }
}