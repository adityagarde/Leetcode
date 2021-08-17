package com.github.aditya;

public class _0704 {
    // 1. Recursive Approach
    // 0 ms, faster than 100.00%, memory 39.4 MB, less than 98.50%
    public static class Solution {
        public int search(int[] nums, int target) {
            return binarySearchRecursive(nums, target, 0, nums.length - 1);
        }

        public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
            if (left > right) {
                return -1;
            }
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                return binarySearchRecursive(arr, target, mid + 1, right);
            } else {
                return binarySearchRecursive(arr, target, left, mid - 1);
            }
        }
    }

    // 2. Iterative Approach
    // 0 ms, faster than 100.00%, memory 39.7 MB, less than 82.60%
    public static class Solution_1 {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
}