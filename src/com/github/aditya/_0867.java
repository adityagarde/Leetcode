package com.github.aditya;

public class _0867 {
    // 0 ms, faster than 100.00%, memory 42.9 MB, less than 93.96%
    // Time Complexity O(mn) and Space Complexity O(nm)
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] result = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = matrix[j][i];
                }
            }
            return result;
        }
    }
}