package com.github.aditya;

public class _0075 {
    // 0 ms, faster than 100% and memory 37.2 MB, less than 96.54%
    // In the first pass - collect all the 0s - two adjacent pointers i and j
    // If i is already 0 [Ex - 0,0,2...] i++ and j++ and continue
    // When j encounters 0 just swap contents of i and j
    // In the second pass repeat the same logic for 1.
    public static class Solution {
        public void sortColors(int[] nums) {
            int i = 0, j = 1;
            for (int k = 0; i < nums.length && j < nums.length && k < nums.length; k++) {
                if (nums[i] == 0) {
                    i++; j++;
                    continue;
                }
                if (nums[j] == 0) {
                    swap(nums, i, j);
                    i++;
                }
                j++;
            }
            j = i + 1;
            for (int k = 0; i < nums.length && j < nums.length && k < nums.length; k++) {
                if (nums[i] == 1) {
                    i++; j++;
                    continue;
                }
                if (nums[j] == 1) {
                    swap(nums, i, j);
                    i++;
                }
                j++;
            }
        }

        public void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
