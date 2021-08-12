package com.github.aditya;

public class _0485 {
    // 2ms, faster than 53.16%, Two Pointers
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int i = 0, j = 0;
            int max = 0;
            while (j < nums.length) {
                if (nums[j] == 1)
                    j++;
                else if (nums[j] == 0) {
                    max = Math.max(max, j - i);
                    i = j;
                    i++;
                    j++;
                }
            }
            return Math.max(max, j - i);
        }
    }
}