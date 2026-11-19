package practice;

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        List<Integer> points = new ArrayList<>();
        for(int i = 1; i < prices.length - 1; i++) {
            if (prices[i] < prices[i-1] && prices[i] < prices[i+1]) points.add(i);
            if(prices[i-1] < prices[i] && prices[i+1] < prices[i]) points.add(i);
        }

        int[] answer = new int[points.size()];
        for (int k = 0; k < points.size(); k++) {
            int point = points.get(k);
            int width = 0;
            int now = prices[point];
            boolean isPeak = now > prices[point - 1];

            int prevLeft = now;
            int prevRight = now;
            int offset = 1;

            while (point - offset >= 0 && point + offset < prices.length) {
                int left = prices[point - offset];
                int right = prices[point + offset];

                if (isPeak) {
                    // 내리막
                    if (prevLeft > left && prevRight > right) {
                        width++;
                        prevLeft = left;
                        prevRight = right;
                    } else {
                        break;
                    }
                } else {
                    // 오르막
                    if (prevLeft < left && prevRight < right) {
                        width++;
                        prevLeft = left;
                        prevRight = right;
                    } else {
                        break;
                    }
                }
                offset++;
            }
            answer[k] = isPeak ? width : -width;
        }


        return answer;
    }
}

public class Test2 {
    public static void main(String[] args) {
        int[][] prices = {
                {
                        12, 6, 6, 12, 6, 24, 30, 32, 34,
                        36, 24, 18, 6, 6, 18, 30, 6
                },
                {
                        4, 3, 2, 1, 2, 3, 4, 3, 2, 1
                },
                {
                        1000, 2000, 3000, 2000, 3000, 4000, 3000
                }
        };

        int[][] expected = {
                {1, -1, 3, 1},
                {-3, 3},
                {1, -1, 1}
        };

        for (int i = 0; i < prices.length; i++) {
            Solution sol = new Solution();
            int[] result = sol.solution(prices[i].clone());

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