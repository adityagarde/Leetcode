package com.github.aditya;

public class _1423 {
    // 1 ms, faster than 100.00%, memory 51 MB, less than 86.68%
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int sum = 0;
            for (int i = 0; i < k; i++)
                sum += cardPoints[i];

            int max = sum;

            for (int i = k - 1, j = cardPoints.length - 1; i >= 0; i--, j--) {
                sum = sum + cardPoints[j] - cardPoints[i];
                max = Math.max(sum, max);
            }
            return max;
        }
    }
}