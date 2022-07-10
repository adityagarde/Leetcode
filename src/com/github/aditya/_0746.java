package com.github.aditya;

public class _0746 {
    // 0 ms, faster than 100.00%, memory 41.5 MB, less than 99.76%
    // Time Complexity O(n) and Space Complexity O(1) - Optimized DP
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int first = 0;
            int second = 0;
            for (int i = cost.length - 1; i >= 0; i--) {
                int current = cost[i] + Math.min(first, second);
                first = second;
                second = current;
            }

            return Math.min(first, second);
        }
    }

    // 0 ms, faster than 100.00%, memory 41.9 MB, less than 93.59%
    // Time Complexity O(n) and Space Complexity O(1) - Changing the input array though
    class Solution_1 {
        public int minCostClimbingStairs(int[] cost) {
            for (int i = cost.length - 3; i >= 0; i--)
                cost[i] += Math.min(cost[i + 1], cost[i + 2]);

            return Math.min(cost[0], cost[1]);
        }
    }
}