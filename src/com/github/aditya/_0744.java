package com.github.aditya;

public class _0744 {
    // 0ms, faster than 100.00%, memory 38.8 MB, less than 98.98%
    // When letters[mid] is greater than target, we store the result as a possible solution and continue binary search
    // When the target is found (letters[mid] == target) - don't just return the next element as there can be duplicates
    // Instead make left as (mid + 1) and continue search in Binary fashion only and not linear.
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int left = 0, right = letters.length - 1;
            int result = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (letters[mid] == target) {
                    left = mid + 1;
                } else if (letters[mid] > target) {
                    result = mid;
                    right = mid - 1;
                } else if (letters[mid] < target) {
                    left = mid + 1;
                }
            }
            return letters[result];
        }
    }
}