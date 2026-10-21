import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        List<List<Integer>> matrix = new ArrayList<>();
        int total = brown + yellow;
        
        for (int i = 1; i < (int) total / 2; i++) {
            if (total % i == 0) {
                List<Integer> list = new ArrayList<>();
                int temp = Math.max(i, total / i);
                list.add(temp);
                list.add(total / temp);
                matrix.add(list);
            }
        }
        
        for (List<Integer> list : matrix) {
            if (yellow == (list.get(0)-2) * (list.get(1)-2)) {
                int[] answer = new int[list.size()];
                for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
                return answer;
            }         
        }

        return new int[]{};
    }
}