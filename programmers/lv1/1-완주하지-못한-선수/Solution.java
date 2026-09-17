import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> com = new HashMap<>();

        for (int i = 0; i < participant.length; i++)
            com.put(participant[i], com.getOrDefault(participant[i], 0) + 1);
        
        for (String c : completion) {
            com.put(c, com.get(c) - 1);
        }
        
        for (String p : participant) {
            if (com.get(p) != 0) return p;
        }
        return "";
    }
}