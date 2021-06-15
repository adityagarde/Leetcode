package com.github.aditya;

public class _0704 {
    public static class Solution {
        public int search(int[] nums, int target) {
            return binarySearchRecursive(nums, target);
        }

        public static int binarySearchRecursive(int[] arr, int x, int left, int right) {
            if (left > right) {
                return -1;
            }

            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return binarySearchRecursive(arr, x, mid + 1, right);
            } else if (x < arr[mid]) {
                return binarySearchRecursive(arr, x, left, mid - 1);
            }
            return -1;
        }

        public static int binarySearchRecursive(int[] arr, int x) {
            return binarySearchRecursive(arr, x, 0, arr.length - 1);
        }
    }
}