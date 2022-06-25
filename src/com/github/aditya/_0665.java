package com.github.aditya;

public class _0665 {
    // 1 ms, faster than 97.39%, memory 43.2 MB, less than 98.10%
    // Time Complexity O(n) and Space Complexity O(1).
    class Solution {
        public boolean checkPossibility(int[] nums) {
            boolean changed = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1])
                    continue;
                if (changed)
                    return false;

                if (i == 0 || nums[i + 1] >= nums[i - 1])
                    nums[i] = nums[i + 1];
                else
                    nums[i + 1] = nums[i];
                changed = true;
            }
            return true;
        }
    }
}