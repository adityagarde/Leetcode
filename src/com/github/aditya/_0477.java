package com.github.aditya;

public class _0477 {
    // 4 ms, faster than 100.00%, 39.8 MB, less than 83.27%
    class Solution {
        public int totalHammingDistance(int[] nums) {
            int result = 0;
            for (int i = 0; i < 32; i++) {
                int count1 = 0;
                for (int num : nums) {
                    count1 += (num >> i) & 1;
                }
                result += count1 * (nums.length - count1);
            }
            return result;
        }
    }
}