import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> seq = new ArrayDeque<>();
        
        for (int i : priorities) {
            queue.offer(i);
        }
        for (int i = 0; i < priorities.length; i++) {
            seq.offer(i);
        }
        
        int answer = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int idx = seq.poll();

            // System.out.printf("%d %d\n", current, idx);
            boolean higher = false;
            for (int i : queue) {
                if (current < i) {
                    higher = true;
                    break;
                }
            }
            
            if (higher) {
                // System.out.printf("큰 값 존재", answer);
                queue.offer(current);
                seq.offer(idx);     
                continue;
            }
                    
            else {
                answer++;
                System.out.printf("answer: %d \n", answer);
            }
            
            if (idx == location) return answer;
        }
        
        return 100;
    }
}