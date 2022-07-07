package com.github.aditya;

public class _0097 {
    // 3 ms, faster than 75.76%, memory 42.5 MB, less than 42.21%
    // DP - Time Complexity O(m*n) and Space Complexity O(m*n) m,n are input strings' length
    class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            if (s1.length() + s2.length() != s3.length())
                return false;

            boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
            dp[0][0] = true;

            for (int i = 1; i < dp.length; i++) {
                if (dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1))
                    dp[i][0] = true;
            }

            for (int j = 1; j < dp[0].length; j++) {
                if (dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1))
                    dp[0][j] = true;
            }

            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                        dp[i][j] = true;
                    else if (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1))
                        dp[i][j] = true;
                }
            }

            return dp[s1.length()][s2.length()];
        }
    }
}