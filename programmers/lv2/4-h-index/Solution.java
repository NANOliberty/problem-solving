import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        if (citations[n-1] == 0) return 0;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i && i <= citations[i]) return n - i;
        }
        return 0;
    }
}