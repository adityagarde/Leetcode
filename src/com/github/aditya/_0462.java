package com.github.aditya;

import java.util.Arrays;

public class _0462 {
    // 4 ms, faster than 90.87%, memory 43 MB, less than 91.97%
    // Time Complexity O(nlogn) and Space Complexity O(1)
    class Solution {
        public int minMoves2(int[] nums) {
            int moves = 0;
            Arrays.sort(nums);
            int mid = nums[nums.length / 2];
            for (int num : nums)
                moves += Math.abs(num - mid);

            return moves;
        }
    }
}