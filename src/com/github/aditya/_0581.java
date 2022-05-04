package com.github.aditya;

import java.util.Arrays;

public class _0581 {
    // 7 ms, faster than 37.63%, memory 43.5 MB, less than 78.40% - Not Optimal
    // Time Complexity O(nlogn) (because of Sorting), Space Complexity O(n) (extra array used).
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int[] sorted = nums.clone();
            Arrays.sort(sorted);
            int left = 0, right = sorted.length;
            for (int i = 0; i < sorted.length; i++) {
                if (sorted[i] != nums[i]) {
                    left = Math.max(left, i);
                    right = Math.min(right, i);
                }
            }
            return right - left > 0 ? right - left + 1 : 0;
        }
    }
}