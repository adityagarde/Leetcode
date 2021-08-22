package com.github.aditya;

public class _0852 {
    // 0 ms, faster than 100.00%, memory 38.7 MB, less than 97.49%, Binary Search 0(log n)
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    return mid;
                } else if (arr[mid] > arr[mid + 1]) {
                    right = mid;
                } else if (arr[mid] > arr[mid - 1]) {
                    left = mid;
                }
            }
            return -1;
        }
    }
}