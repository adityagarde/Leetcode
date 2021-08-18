package com.github.aditya;

public class _0033 {
    class Solution {
        // 0 ms, faster than 100.00%, Binary Search
        /*
         * First find the index of the minimum element
         * Check the explanation for 1st step - https://github.com/adityagarde/Leetcode/blob/main/src/com/github/aditya/_0153.java
         * Arr = [4, 5, 6, 7, 0, 1, 2], minimum element = 0 and thus minIndex = 4
         * Apply binary search individually to the 2 now-sorted sub arrays [4, 5, 6, 7] & [0, 1, 2]
         */
        public int search(int[] nums, int target) {
            int minIndex = findMinIndex(nums);
            int first = binarySearch(nums, target, 0, minIndex - 1);
            int last = binarySearch(nums, target, minIndex, nums.length - 1);

            return first >= 0 ? first : last >= 0 ? last : -1;
        }

        public int binarySearch(int[] nums, int target, int left, int right) {
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

        public int findMinIndex(int[] nums) {
            int left = 0, right = nums.length - 1;
            int N = nums.length;

            if (nums[left] <= nums[right]) {
                return left;
            }

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= nums[(mid + 1) % N]) {
                    return (mid + 1) % N;
                }
                if (nums[mid] <= nums[(mid + N - 1) % N]) {
                    return mid;
                }
                if (nums[mid] <= nums[left]) {
                    right = mid - 1;
                } else if (nums[mid] >= nums[right]) {
                    left = mid + 1;
                }
            }
            return -1;
        }
    }
}