package com.github.aditya;

public class _0091 {
    // 1 ms, faster than 98.62%, memory 40.8 MB, less than 89.43%
    // DP - Time Complexity O(n) and Space Complexity O(n)
    class Solution {
        public int numDecodings(String s) {
            int[] dp = new int[s.length() + 1];
            dp[0] = 1;
            dp[1] = s.charAt(0) == '0' ? 0 : 1;

            for (int i = 2; i <= s.length(); i++) {
                int oneLengthString = Integer.parseInt(s.substring(i - 1, i));
                int twoLengthString = Integer.parseInt(s.substring(i - 2, i));

                if (oneLengthString > 0)
                    dp[i] += dp[i - 1];
                if (twoLengthString <= 26 && twoLengthString >= 10)
                    dp[i] += dp[i - 2];
            }

            return dp[s.length()];
        }
    }
}