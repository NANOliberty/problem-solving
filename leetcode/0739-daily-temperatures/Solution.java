// O(n**2)은 시간 초과...
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int n = stack.pop();
                answer[n] = i - n;
            }
            stack.push(i);
        }
        return answer;

    }
}