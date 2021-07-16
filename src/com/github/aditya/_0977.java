package com.github.aditya;

public class _0977 {
    public static class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] arr = new int[nums.length];
            int i = 0, j = nums.length - 1, k = nums.length - 1;
            while (i <= j) {
                if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                    arr[k] = nums[i] * nums[i];
                    i++;
                } else {
                    arr[k] = nums[j] * nums[j];
                    j--;
                }
                k--;
            }
            return arr;
        }
    }
}
