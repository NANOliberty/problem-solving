import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : terms) {
            String[] temp = s.split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]));
        }

        int todayTotal = toDays(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] s2 = privacies[i].split(" ");
            int total = toDays(s2[0]) + map.get(s2[1]) * 28;
            if (total <= todayTotal) answer.add(i + 1);
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) result[i] = answer.get(i);

        return result;
    }

    private int toDays(String date) {
        String[] d = date.split("\\.");
        return Integer.parseInt(d[0]) * 12 * 28
             + Integer.parseInt(d[1]) * 28
             + Integer.parseInt(d[2]);
    }
}