package com.github.aditya;

public class _0070 {
    // 0 ms, faster than 100.00%, memory 38.9 MB, less than 93.21%
    // DP - BOTTOM UP + SPACE OPTIMIZATION
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public int climbStairs(int n) {
            if (n < 3)
                return n;

            int num1 = 1, num2 = 2;

            for (int i = 3; i <= n; i++) {
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }

            return num2;
        }
    }

    // 0 ms, faster than 100.00%, memory 39.2 MB, less than 87.75%
    // DP - BOTTOM UP - Time Complexity O(n) and Space Complexity O(n)
    class Solution_1 {
        public int climbStairs(int n) {
            if (n < 3)
                return n;
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i < dp.length; i++)
                dp[i] = dp[i - 1] + dp[i - 2];

            return dp[n];
        }
    }

    // NAIVE RECURSION - Time Limit Exceeded as Time Complexity is O(2^n)
    class Solution_2 {
        public int climbStairs(int n) {
            if (n < 3)
                return n;
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}