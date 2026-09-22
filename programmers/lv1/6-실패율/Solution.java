import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[] rate = new double[N+1];
        Integer[] answer = new Integer[N];
        int[] answer_list = new int[N];
        int n = 0;
        int count = 0;
        
        for (int i = 1; i < N+1; i++) {
            for (int s : stages) {
                if (s >= i) n++;
                if (s == i) count++;
            }
            if (n == 0) rate[i] = 0;   
            else rate[i] = (double) count / n;
            n = 0;
            count = 0;
        }
        
        for (int i = 1; i < N+1; i++) {
            answer[i-1] = i;
        }
        
        Arrays.sort(answer, (a, b) -> Double.compare(rate[b], rate[a]));
        
        for (int i = 0; i < N; i++) {
            answer_list[i] = answer[i];
        }
        
        return answer_list;
    }
}