package com.github.aditya;

public class _0376 {
    // 0 ms, faster than 100.00%, memory 40.8 MB, less than 81.55%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length == 1)
                return 1;
            int previous = nums[1] - nums[0];
            int count = 1;

            for (int i = 1; i < nums.length; i++) {
                int current = nums[i - 1] - nums[i];
                if ((previous >= 0 && current < 0) || (previous <= 0 && current > 0)) {
                    count++;
                    previous = current;
                }
            }
            return count;
        }
    }
}