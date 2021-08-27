package com.github.aditya;

public class _1283 {
    // 7 ms, faster than 97.81% - Binary Search
    class Solution {
        public int smallestDivisor(int[] nums, int threshold) {
            int left = 1, right = 0;
            for (int num : nums) {
                if (num > right)
                    right = num;
            }
            int result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (isValid(nums, threshold, mid)) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return result;
        }

        public boolean isValid(int[] arr, int threshold, int divisor) {
            int sum = 0;
            for (int num : arr) {
                sum += (num - 1) / divisor + 1;
            }
            return sum <= threshold;
        }
    }
}