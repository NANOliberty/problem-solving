import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        
        for(int[] command : commands) {
            int[] slice = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(slice);
            answer[i] = slice[command[2]-1];
            i++; 
        }
        
        return answer;
    }
}