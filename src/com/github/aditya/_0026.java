package com.github.aditya;

public class _0026 {
    // 1ms, In place Solution
    // Two pointers - i for unique number and j for current number
    // If num at i and j are different and they are not adjacent
    // - we just put the current (j) num at i + 1 location and i++.
    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0, j = 1;
            while (i < j && j < nums.length) {
                if (nums[i] != nums[j]) {
                    if (nums[i + 1] != nums[j]) {
                        nums[i + 1] = nums[j];
                    }
                    i++;
                }
                j++;
            }
            return i + 1;
        }
    }
}