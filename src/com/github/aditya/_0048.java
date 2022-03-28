package com.github.aditya;

public class _0048 {
    // 0 ms, faster than 100.00%, memory 42.2 MB, less than 76.56%
    class Solution {
        public void rotate(int[][] matrix) {
            int left = 0;
            int right = matrix.length - 1;

            while (left < right) {
                for (int i = 0; i < right - left; i++) {
                    int top = left;
                    int bottom = right;

                    // save the top left in temp var
                    int temp = matrix[top][left + i];

                    // move bottom left to top left
                    matrix[top][left + i] = matrix[bottom - i][left];
                    // move bottom right to bottom left
                    matrix[bottom - i][left] = matrix[bottom][right - i];
                    // move top right to bottom right
                    matrix[bottom][right - i] = matrix[top + i][right];
                    // move top left (from temp) to top right
                    matrix[top + i][right] = temp;
                }
                left++;
                right--;
            }
        }
    }
}