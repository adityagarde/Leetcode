package com.github.aditya;

public class _0062 {
    // 0 ms, faster than 100.00%, memory 39.1 MB, less than 90.11%
    // DP - TABULATION - Time Complexity O(m*n) and Space Complexity O(m*n)
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
            for (int i = 0; i < dp.length; i++) // GOING RIGHT
                dp[i][0] = 1;

            for (int j = 0; j < dp[0].length; j++) // GOING DOWN
                dp[0][j] = 1;

            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // TOTAL POSSIBLE WAYS = RIGHT + DOWN
                }
            }

            return dp[m - 1][n - 1];
        }
    }

    // NAIVE RECURSION - TIME LIMIT EXCEEDED - TC = O(2^mn)
    class Solution_1 {
        public int uniquePaths(int m, int n) {
            if (m == 1 || n == 1)
                return 1;

            return uniquePaths(m - 1, n) + uniquePaths(m, n - 1); // DOWN + RIGHT
        }
    }
}