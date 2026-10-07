import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> hash = new HashMap<>();
        
        for (String[] s : clothes) {
            hash.put(s[1], hash.getOrDefault(s[1], 0) + 1);
        }
        
        int answer = 1;
        for (int i : hash.values()) answer *= (i + 1);
        
        return answer - 1;
    }
}

/*

h -> 2
e -> 1
f -> 1

nCr = nPr/r! = n!/r!(n-r)!

  1          2             3
(4C1) + (3C2 + 2C1) + (3C3 + 2C1) = 4 + 5 + 2 = 11

생각해보니 경우의 수에서 해당 종류의 옷을 입지 않는 경우까지 + 1하고 나중에 아무것도 안 입는 경우 빼주면 될 듯

(h + 1) + (e + 1) + (f + 1) - 1 = 3 * 2 * 2 - 1 = 11

*/