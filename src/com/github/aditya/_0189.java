package com.github.aditya;

public class _0189 {
    // 0 ms, faster than 100.00%, memory 58.3 MB, less than 82.94%
    // Time Complexity O(n) and Space Complexity 0(1)
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        private void reverse(int[] nums, int left, int right) {
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}