package com.github.aditya;

public class _0240 {
    // 4 ms, faster than 100.00%, memory 44.2 MB, less than 92.02%, O(m+n)
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int i = 0;
            int j = matrix[0].length - 1;
            while (i < matrix.length && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }
            }
            return false;
        }
    }
}