import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[speeds.length];
        List<Integer> temp = new ArrayList<>();
        
        for (int i = 0; i < speeds.length; i++) {
            answer[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        int count = 1;
        int max = answer[0];
        for (int i = 1; i < answer.length; i++) {
            if (max >= answer[i]) {
                count++;
                if (i == answer.length - 1) {
                    temp.add(count);
                }
            }
            else {
                temp.add(count);
                count = 1;
                max = answer[i];
                if (i == answer.length - 1) {
                    temp.add(count);
                }
            }
        }
        
        int[] solution = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) solution[i] = temp.get(i);
        
        return solution;
    }
}

/*
하루 작업량: 100-p / s 

temp = [1 3 2]

5 10 1 1 20 1 

if 5 >= 다음 count ++
else : 1

if 10 >= 다음 count++
3
20
...
*/