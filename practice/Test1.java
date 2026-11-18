package practice;

import java.util.*;

class Solution {
    public String[] solution(String[] logs) {
        HashMap<String, Integer> entered = new HashMap<>();
        HashMap<String, Integer> total = new HashMap<>();

        // 여기에 풀이 작성
        for (String s : logs) {
            String[] parts = s.split(" ");
            String time = parts[0];
            String name = parts[1];
            String status = parts[2];
            String[] hm = time.split(":");
            int now = Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]);

            if (status.equals("IN")) {
                entered.put(name, now);
            }
            else {
                int diff = now - entered.get(name);
                total.put(name, total.getOrDefault(name, 0) + diff);
                entered.remove(name);
            }

        }

        int final_end = 23 * 60 + 59;
            for (String temp : entered.keySet()) {
                int duration = final_end - entered.get(temp);
                total.put(temp, total.getOrDefault(temp, 0) + duration);
            }

            String[] answer = total.keySet().toArray(new String[0]);
            Arrays.sort(answer, (a, b) -> {
                int temp = total.get(b) - total.get(a);
                if (temp == 0) return a.compareTo(b);
                return total.get(b) - total.get(a);
            });

        return answer;
    }
}

public class Test1 {
    public static void main(String[] args) {
        String[][] testCases = {
                {
                        "09:00 alex IN",
                        "09:10 bella IN",
                        "09:40 alex OUT",
                        "10:00 bella OUT",
                        "10:10 alex IN",
                        "10:30 alex OUT",
                        "23:00 chris IN"
                },
                {
                        "09:00 zoe IN",
                        "09:10 amy IN",
                        "09:20 zoe OUT",
                        "09:30 amy OUT"
                },
                {
                        "23:59 alex IN"
                },
                {
                        "00:00 bob IN",
                        "00:10 bob OUT",
                        "00:20 bob IN",
                        "00:30 bob OUT",
                        "23:39 amy IN"
                }
        };

        String[][] expected = {
                {"alex", "chris", "bella"},
                {"amy", "zoe"},
                {"alex"},
                {"amy", "bob"}
        };

        for (int i = 0; i < testCases.length; i++) {
            Solution solution = new Solution();
            String[] result = solution.solution(testCases[i]);

            System.out.println("테스트 " + (i + 1));
            System.out.println("예상: " + Arrays.toString(expected[i]));
            System.out.println("실제: " + Arrays.toString(result));
            System.out.println(
                    Arrays.equals(result, expected[i]) ? "PASS" : "FAIL"
            );
            System.out.println();
        }
    }
}