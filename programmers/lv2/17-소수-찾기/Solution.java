import java.util.*;
class Solution {
    
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        perm(numbers, "");
        int count = 0;
        
        for (int i : set) if (isPrime(i)) count++;
        return count;
        
    }
    
    void perm(String numbers, String curr) {
        if (!curr.isEmpty()) set.add(Integer.parseInt(curr));
        for (int i = 0; i < numbers.length(); i++) {
            if (visited[i]) continue;
            visited[i] = true;
            perm(numbers, curr + numbers.charAt(i));
            visited[i] = false;
        }
    }
    
    boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
}