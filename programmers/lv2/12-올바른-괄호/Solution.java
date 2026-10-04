import java.util.*;
class Solution {
    boolean solution(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            
            if (bracket == '(') dq.push(bracket);
            else {
                if (dq.isEmpty()) return false;
                else {
                    dq.pop();
                }
            }
        }
        
        return dq.isEmpty();
    }
}