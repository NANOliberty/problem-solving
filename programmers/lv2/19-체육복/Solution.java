import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        
        for (int i : lost) lostList.add(i);
        for (int i : reserve) reserveList.add(i);
        
        List<Integer> inter = new ArrayList<>(reserveList);
        
        inter.retainAll(lostList);
        lostList.removeAll(reserveList);
        reserveList.removeAll(inter);
        
        lostList.sort(null);
        reserveList.sort(null);
        
        int curr = n - lost.length + inter.size();
        boolean[] visited = new boolean[reserveList.size()];
       

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                int l = lostList.get(i), r = reserveList.get(j);
                if (!visited[j] && (l + 1 == r || l - 1 == r)) {
                    curr++;
                    visited[j] = true;
                    break;
                }
            }
        }
        return curr;
    }
}