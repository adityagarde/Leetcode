package com.github.aditya;

public class _0059 {
    // 0 ms, faster than 100.00%, memory 40.6 MB, less than 82.02%
    // Time Complexity O(n*n) and Space Complexity O(1)
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] result = new int[n][n];
            int num = 1;

            int top = 0, bottom = n - 1, left = 0, right = n - 1;

            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++)
                    result[top][i] = num++;
                top++;

                for (int i = top; i <= bottom; i++)
                    result[i][right] = num++;
                right--;

                if (top > bottom || left > right)
                    break;

                for (int i = right; i >= left; i--)
                    result[bottom][i] = num++;
                bottom--;

                for (int i = bottom; i >= top; i--)
                    result[i][left] = num++;
                left++;
            }
            return result;
        }
    }
}