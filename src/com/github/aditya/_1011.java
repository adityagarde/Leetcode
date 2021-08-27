package com.github.aditya;

public class _1011 {
    class Solution {
        // 8 ms, faster than 91.36%, Memory 42.1 MB, less than 56.78%
        public int shipWithinDays(int[] weights, int days) {
            int left = 0, right = 0;
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] > left)
                    left = weights[i];
                right = right + weights[i];
            }
            int result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (isValid(weights, days, mid)) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return result;
        }

        private boolean isValid(int[] arr, int days, int mid) {
            int count = 1;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                if (sum > mid) {
                    count++;
                    sum = arr[i];
                }
                if (count > days)
                    return false;
            }
            return true;
        }
    }
}