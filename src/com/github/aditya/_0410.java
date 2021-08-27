package com.github.aditya;

public class _0410 {
    // 1 ms, faster than 55.99%
    class Solution {
        public int splitArray(int[] nums, int m) {
            int left = 0, right = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > left)
                    left = nums[i];
                right = right + nums[i];
            }
            int result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (isValid(nums, m, mid)) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return result;
        }

        private boolean isValid(int[] arr, int m, int mid) {
            int count = 1;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                if (sum > mid) {
                    count++;
                    sum = arr[i];
                }
                if (count > m)
                    return false;
            }
            return true;
        }
    }
}