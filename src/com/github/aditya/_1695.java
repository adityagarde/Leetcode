package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _1695 {
    // 61 ms, faster than 84.55%, memory 52.3 MB less than 93.09%
    // Time Complexity O(n) and Space Complexity O(m) m = number of unique elements in array.
    class Solution {
        public int maximumUniqueSubarray(int[] nums) {
            int i = 0, j = 0;
            int maxSum = 0, currentSum = 0;
            Set<Integer> set = new HashSet<>();

            while (j < nums.length) {
                if (!set.contains(nums[j])) {
                    set.add(nums[j]);
                    currentSum += nums[j];
                    j++;
                    maxSum = Math.max(maxSum, currentSum);
                } else {
                    set.remove(nums[i]);
                    currentSum -= nums[i];
                    i++;
                }
            }
            return maxSum;
        }
    }
}