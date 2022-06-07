package com.github.aditya;

public class _0088 {
    // 0 ms, faster than 100.00%, memory 39 MB less than 99.98%
    // Time Complexity O(m+n) and Space Complexity O(1)
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1, j = n - 1, k = m + n - 1;
            while (j >= 0) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }
        }
    }
}