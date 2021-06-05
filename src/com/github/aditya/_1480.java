package com.github.aditya;

public class _1480 {
    public static class Solution {
        public static int[] runningSum(int[] nums) {
            int[] returnArr = new int[nums.length];
            int sum = nums[0];
            returnArr[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum = nums[i] + sum;
                returnArr[i] = sum;
            }
            return returnArr;
        }
    }
}
