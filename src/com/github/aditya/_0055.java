package com.github.aditya;

public class _0055 {
    // 2 ms, faster than 92.23%, memory 42.6 MB, less than 95.10%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public boolean canJump(int[] nums) {
            if (nums.length == 1)
                return true;
            int max = 0;
            int n = nums.length;

            for (int i = 0; i < n && max >= i; i++) {
                max = Math.max(max, i + nums[i]);
                if (max >= n - 1)
                    return true;
            }

            return false;
        }
    }
}
