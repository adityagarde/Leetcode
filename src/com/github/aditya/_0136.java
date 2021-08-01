package com.github.aditya;

public class _0136 {
    // 0 ms, faster than 100.00%
    // using the concept num XOR num = 0 && 0 XOR num = num
    class Solution {
        public int singleNumber(int[] nums) {
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result = result ^ nums[i];
            }
            return result;
        }
    }
}