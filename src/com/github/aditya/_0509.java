package com.github.aditya;

public class _0509 {
    // 0 ms, faster than 100.00%, memory 40.7 MB, less than 64.90%
    // DP TABULATION - Time Complexity O(n) and Space Complexity O(n)
    class Solution {
        public int fib(int n) {
            if (n < 2)
                return n;

            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i < dp.length; i++)
                dp[i] = dp[i - 1] + dp[i - 2];

            return dp[n];
        }
    }

    // 0 ms, faster than 100.00%, memory 40.5 MB, less than 71.02%
    // ITERATIVE - Time Complexity O(n) and Space Complexity O(1)
    class Solution_1 {
        public int fib(int n) {
            if (n < 2)
                return n;

            int num1 = 0, num2 = 1;

            while (n > 1) {
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                n--;
            }

            return num2;
        }
    }

    // 8 ms, faster than 38.37%, memory 40.4 MB, less than 75.28%
    // NAIVE RECURSIVE - Time Complexity O(2^n) and Space Complexity O(n)
    class Solution_2 {
        public int fib(int n) {
            if (n < 2)
                return n;

            return fib(n - 1) + fib(n - 2);
        }
    }
}