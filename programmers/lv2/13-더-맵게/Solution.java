import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        for (int i : scoville) minheap.add(i);
        
        int answer = 0;
        while(minheap.peek() < K) {
            if (minheap.size() < 2) {
                return -1;
            }
            int first = minheap.poll();
            int seconde = minheap.poll();
            
            int current_scoville = first + (seconde * 2);
            minheap.add(current_scoville);
            answer ++;
        }
        
        for (int i : minheap) {
            if (i < K) {
                return -1;
            }
        }
        
        return answer;
    }
}


/*
섞은 음식의 스코빌 지수
= 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

*/