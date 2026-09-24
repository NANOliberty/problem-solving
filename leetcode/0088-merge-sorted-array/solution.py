class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        if (n == 0) :
            nums1.sort()
        elif (m == 0) :
            for i in range(n) :
                nums1[i] = nums2[i]
            nums1.sort()
        else :
            j = 0
            for i in range(m, m+n) :
                nums1[i] = nums2[j]
                print(f"i {i}, j {j}")
                j += 1
            nums1.sort()