package com.github.aditya;

public class _0576 {
    // 4 ms, faster than 100.00%, memory 41.4 MB, less than 92.29%
    // DP - Memoization
    class Solution {
        Integer[][][] dp = null;
        int mod = 1000000007;

        public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
            dp = new Integer[m][n][maxMove + 1];
            return findPathsHelper(m, n, maxMove, startRow, startColumn);
        }

        private int findPathsHelper(int m, int n, int maxMove, int row, int col) {
            if (row == m || col == n || row < 0 || col < 0) return 1;
            if (maxMove <= 0) return 0;

            if (dp[row][col][maxMove] != null)
                return dp[row][col][maxMove];

            int count = 0;
            count = findPathsHelper(m, n, maxMove - 1, row, col - 1);
            count = count % mod + findPathsHelper(m, n, maxMove - 1, row, col + 1);
            count = count % mod + findPathsHelper(m, n, maxMove - 1, row - 1, col);
            count = count % mod + findPathsHelper(m, n, maxMove - 1, row + 1, col);

            dp[row][col][maxMove] = count % mod;

            return dp[row][col][maxMove];
        }
    }
}