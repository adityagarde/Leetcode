package com.github.aditya;

public class _0081 {
    // 0 ms, faster than 100.00%, Memory 38.3 MB, less than 95.99%, Binary Search
    static class Solution {
        public boolean search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target == nums[mid] || target == nums[right])
                    return true;
                if (nums[mid] > nums[left]) { // Checking if the left side is sorted.
                    if (target < nums[mid] && target >= nums[left]) { // Is target in the scope ?
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else if (nums[mid] < nums[right]) { // Checking if the right side is sorted.
                    if (target > nums[mid] && target <= nums[right]) { // Checking if target is in the scope.
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else // Handling duplicates, thus we check target == nums[right] in the initial condition.
                    right--; // one step back in linear fashion
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 6));
    }
}