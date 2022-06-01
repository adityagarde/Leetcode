package com.github.aditya;

public class _1480 {
    // 0 ms, faster than 100.00%, memory 42 MB, less than 93.18%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i] + nums[i - 1];
            }
            return nums;
        }
    }
}