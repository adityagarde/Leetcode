package com.github.aditya;

public class _1486 {
    public static class Solution {
        public int xorOperation(int n, int start) {

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = start + 2 * i;
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    result = nums[i] ^ result;
                } else {
                    result = nums[i];
                }
            }
            
            return result;
        }
    }
}
