package com.github.aditya;

public class _0905 {
    // 1 ms, faster than 96.63%, memory 43 MB, less than 91.80%
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int i = nums[left] % 2;
                int j = nums[right] % 2;
                if (i == 1 && j == 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                } else if (i == 0 && j == 0) {
                    left++;
                } else if (i == 1 && j == 1) {
                    right--;
                } else {
                    left++;
                    right--;
                }
            }
            return nums;
        }
    }
}