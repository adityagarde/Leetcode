package com.github.aditya;

public class _0031 {
    // 1 ms, faster than 82.78%, memory 43.7 MB, less than 60.15%
    // Time Complexity ~ O(n) and Space Complexity O(1)
    // Start from behind, find the first dip, swap it with the next greater element and reverse the part after the dip.
    class Solution {
        public void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) i--;

            if (i >= 0) {
                int j = nums.length - 1;
                while (nums[i] >= nums[j]) j--;
                swap(nums, i, j);
            }
            reverse(nums, i + 1, nums.length - 1);
        }

        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        private void reverse(int[] arr, int left, int right) {
            while (left < right)
                swap(arr, left++, right--);
        }
    }
}