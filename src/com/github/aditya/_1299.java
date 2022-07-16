package com.github.aditya;

public class _1299 {
    // 1 ms, faster than 100.00%, memory 44.3 MB, less than 92.34%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public int[] replaceElements(int[] arr) {
            int max = -1;
            for (int i = arr.length - 1; i >= 0; i--) {
                int current = arr[i];
                arr[i] = max;
                max = Math.max(max, current);
            }
            return arr;
        }
    }

    // BRUTE_FORCE : POOR Performance, Time Complexity O(n^2)
    // 180 ms, faster than 26.84%, memory 54.1 MB, less than 65.69%
    class Solution_1 {
        public int[] replaceElements(int[] arr) {
            if (arr.length == 1)
                return new int[]{-1};

            for (int i = 0; i < arr.length; i++) {
                int max = -1;
                for (int j = i + 1; j < arr.length; j++) {
                    max = Math.max(max, arr[j]);
                }
                arr[i] = max;
            }
            return arr;
        }
    }
}