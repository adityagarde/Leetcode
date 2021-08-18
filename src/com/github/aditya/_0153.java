package com.github.aditya;

public class _0153 {
    class Solution {
        // 0 ms, faster than 100.00%, Binary Search, Intuitive
        // * return the left element if the array is already sorted with 0 rotations
        // * return the (mid + 1) element if the mid element is greater than its next element
        // * return the (mid) element if the mid element is lesser than its previous element
        public int findMin(int[] nums) {
            int left = 0, right = nums.length - 1;
            int N = nums.length;

            if (nums[left] <= nums[right]) {
                return nums[left];
            }

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= nums[(mid + 1) % N]) {
                    return nums[(mid + 1) % N];
                }
                if (nums[mid] <= nums[(mid + N - 1) % N]) {
                    return nums[mid];
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
