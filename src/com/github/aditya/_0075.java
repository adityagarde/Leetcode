package com.github.aditya;

public class _0075 {
    // 1. One Pass - 0ms, faster than 100%
    // i and j - two pointers at start and end of the array, k to loop
    // swap i and current num (k) when 0 found and swap j and k when 2 is found
    public static class Solution {
        public void sortColors(int[] nums) {
            int i = 0, j = nums.length - 1, k = 0;
            while (k < nums.length) {
                if (nums[k] == 0 && k != i) {
                    swap(nums, i, k);
                    i++;
                } else if (nums[k] == 2 && k < j) {
                    swap(nums, j, k);
                    j--;
                } else
                    k++;
            }
        }

        public void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

    // 2. Two Pass - 0 ms, faster than 100% and memory 37.2 MB, less than 96.54%
    // In the first pass - collect all the 0s - two adjacent pointers i and j
    // If i is already 0 [Ex - 0,0,2...] i++ and j++ and continue
    // When j encounters 0 just swap contents of i and j
    // In the second pass repeat the same logic for 1.
    public static class Solution_1 {
        public void sortColors(int[] nums) {
            int i = 0, j = 1;
            for (int k = 0; i < nums.length && j < nums.length && k < nums.length; k++) {
                if (nums[i] == 0) {
                    i++; j++;
                    continue;
                }
                if (nums[j] == 0) {
                    swap(nums, i, j);
                    i++;
                }
                j++;
            }
            j = i + 1;
            for (int k = 0; i < nums.length && j < nums.length && k < nums.length; k++) {
                if (nums[i] == 1) {
                    i++; j++;
                    continue;
                }
                if (nums[j] == 1) {
                    swap(nums, i, j);
                    i++;
                }
                j++;
            }
        }

        public void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
