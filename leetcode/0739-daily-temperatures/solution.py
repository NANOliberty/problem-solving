class Solution:
    def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
        stack = []
        answer = [0] * len(temperatures)

        for i in range(len(temperatures)) :
            while (stack and temperatures[i] > temperatures[stack[-1]]) :
                n = stack.pop()
                answer[n] = i - n  
            stack.append(i)

        return answer