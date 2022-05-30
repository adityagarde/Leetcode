package com.github.aditya;

public class _0268 {
    // 0 ms, faster than 100.00%, memory 42.8 MB, less than 97.13%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int currentSum = 0;

            for (int num : nums)
                currentSum += num;

            return expectedSum - currentSum;
        }
    }
}