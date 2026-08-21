class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int[] result=new int[m+n];
        int i = m - 1;       // last actual element in nums1
        int j = n - 1;       // last element in nums2
        int k = m + n - 1;   // last position in nums1

        // Merge from the back
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // If nums2 still has elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // Print result
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}