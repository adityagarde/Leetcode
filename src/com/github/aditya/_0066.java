package com.github.aditya;

public class _0066 {
    class Solution {
        // 0ms, faster than 100%
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; --i) {
                if (digits[i] != 9) {
                    digits[i] += 1;
                    return digits;
                }
                digits[i] = 0;
            }

            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}