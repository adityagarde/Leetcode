package com.github.aditya;

public class _0035 {
    // 0 ms, faster than 100.00%
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            if (target > nums[right])
                return right + 1;

            int index = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    index = mid;
                    right = mid - 1;
                }
            }
            return index;
        }
    }
}

/**
 * This question is logically similar to Finding Ceil of a given element.
 * - https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/
 */