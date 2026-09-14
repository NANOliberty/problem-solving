from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        best = 0

        while left < right:
            area = (right - left) * min(height[left], height[right])
            best = max(best, area)

            # 면적은 더 낮은 쪽에 갇혀 있으므로, 낮은 쪽만 옮긴다
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return best
