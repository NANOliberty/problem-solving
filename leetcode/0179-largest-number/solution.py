class Solution:
    def largestNumber(self, nums: list[int]) -> str:
        def compare(a, b) :
            if a+b > b+a :
                return -1
            elif b+a < a+b :
                return 1
            else :
                return 0

        answer = [str(x) for x in nums]
        answer.sort(key = cmp_to_key(compare))
        answer_str = ''.join(answer)
        
        return answer_str if answer_str[0] != "0" else "0" 