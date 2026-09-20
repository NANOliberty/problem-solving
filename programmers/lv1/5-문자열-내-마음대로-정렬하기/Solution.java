import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (x, y) -> (x.charAt(n) != y.charAt(n)) ? Character.compare(x.charAt(n), y.charAt(n)) : x.compareTo(y));
        return strings;
    }
}