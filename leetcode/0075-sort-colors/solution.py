class Solution:
    def sortColors(self, nums: list[int]) -> None:
        nums_info = [0] * 3
        for num in nums :
            if num == 0 :
                nums_info[0] += 1
            elif num == 1:
                nums_info[1] += 1
            else :
                nums_info[2] += 1
        for i in range(len(nums)) :
            if (nums_info[0] > 0) :
                nums[i] = 0
                nums_info[0] -= 1
            elif (nums_info[1] > 0) :
                nums[i] = 1
                nums_info[1] -= 1
            else :
                nums[i] = 2
                nums_info[2] -= 1