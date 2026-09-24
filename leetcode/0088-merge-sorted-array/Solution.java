class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            Arrays.sort(nums1);
        }
        else if (m == 0) {
            for (int i = 0; i < nums2.length; i++) nums1[i] = nums2[i];
            Arrays.sort(nums1);
        }

        else {
            // m != 0 && n != 0
            int j = 0;
            for (int i = m; i < m+n; i++) { 
                nums1[i] = nums2[j];  
                j++;
            }
            Arrays.sort(nums1);
        }

    }
}