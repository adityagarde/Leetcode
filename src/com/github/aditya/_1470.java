package com.github.aditya;

public class _1470 {
    class Solution {
        public int[] shuffle(int[] nums, int n) {

            int[] finalArr = new int[2 * n];
            for (int i = 0, j = n, k = 0; i < n && j < 2 * n; i++, j++) {
                finalArr[k] = nums[i];
                finalArr[k + 1] = nums[j];
                k = k + 2;
            }

            return finalArr;

        }

    }
}
