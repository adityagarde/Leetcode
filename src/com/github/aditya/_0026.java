package com.github.aditya;

public class _0026 {
    // 0 ms, faster than 100.00%, memory 43.4 MB, less than 98.97%, In place Solution
    // Two pointers - i for unique number and j for current number
    // If num at i and j are different, we do i++ and put the current (j) at i location.
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[j] = nums[i];
                }
            }
            return i + 1;
        }
    }
}