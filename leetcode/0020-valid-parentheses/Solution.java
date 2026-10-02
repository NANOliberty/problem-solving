class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
            
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            }
            else if (s.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return false;
            }
            else if (s.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

}