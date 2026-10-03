import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> bridge = new ArrayDeque<>();
        Deque<Integer> wait = new ArrayDeque<>();
        
        for (int i : truck_weights)
            wait.offer(i);
        
        for (int i = 0; i < bridge_length; i++)
            bridge.offer(0);
        
        int time = 0;
        int sum = 0;
        
        while (!bridge.isEmpty()) {
            time++;
            int pass = bridge.poll();
            sum -= pass;
            
            if (!wait.isEmpty()) {
                int temp = wait.peek();
                if (sum + temp <= weight) {
                    int truck = wait.poll();
                    bridge.offer(truck);
                    sum += truck;
                }
                else  bridge.offer(0);
            }
        }
        return time;
    }
}