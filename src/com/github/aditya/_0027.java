package com.github.aditya;

public class _0027 {
    // 0ms, faster than 100%
    // Two Pointers - i in front and j at the tail of error
    // When i encounters val and j doesn't swap
    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0, j = nums.length - 1;
            while (i < j) {
                if (nums[i] != val && nums[j] != val) {
                    i++;
                } else if (nums[i] == val && nums[j] != val) {
                    swap(nums, i, j);
                    i++;
                    j--;
                } else if (nums[i] != val && nums[j] == val) {
                    i++;
                    j--;
                } else if (nums[i] == val && nums[j] == val) {
                    j--;
                }
            }
            return i;
        }

        public void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
