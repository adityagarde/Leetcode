package com.github.aditya;

public class _0556 {
    // 0 ms, faster than 100.00%, Memory 35.6 MB, less than 88.20%
    // Start from behind, find the first dip, swap it with the next greater element and reverse the part after the dip.
    class Solution {
        public int nextGreaterElement(int n) {
            char[] chArr = Integer.toString(n).toCharArray();
            int i = chArr.length - 2; // We need to compare, thus starting from penultimate index.
            // Find the dip.
            while (i >= 0 && chArr[i] >= chArr[i + 1]) i--;
            if (i == -1) return -1;

            // Finding Next greater element than the dip chArr[i].
            int j = chArr.length - 1;
            while (chArr[i] >= chArr[j]) j--;

            swap(chArr, i, j);
            reverse(chArr, i + 1);

            long result = Long.parseLong(new String(chArr));

            return result <= Integer.MAX_VALUE ? (int) result : -1;
        }

        private void swap(char[] chArr, int i, int j) {
            chArr[i] ^= chArr[j];
            chArr[j] ^= chArr[i];
            chArr[i] ^= chArr[j];
        }

        private void reverse(char[] chArr, int left) {
            int right = chArr.length - 1;
            while (left < right) {
                swap(chArr, left++, right--);
            }
        }
    }
}