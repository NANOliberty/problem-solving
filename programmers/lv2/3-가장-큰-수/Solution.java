import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] strArray = new String[numbers.length];
        String answer = "";
        
        for (int i = 0; i < numbers.length; i++)
            strArray[i] = String.valueOf(numbers[i]);
        
        Arrays.sort(strArray, (b, a) -> (a + b).compareTo(b + a)); // compareTo를 이용하여 내림차순 정렬
        if (strArray[0].equals("0")) return "0";
        
        for (String s : strArray) answer += s;
        
        return answer;
    }
}