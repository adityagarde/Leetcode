package com.github.aditya;

import java.util.Arrays;

public class _1886 {
    // 0 ms, faster than 100.00%, memory 40.7 MB, less than 86.34%
    // The rotate(matrix) rotates matrix by 90 degrees and we rotate it 4 times (90, 180, 270) to check if we get the target.
    // See https://github.com/adityagarde/Leetcode/blob/main/src/com/github/aditya/_0048.java
    // O(n^2) time complexity, and 0(1) space.
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            for (int i = 0; i < 4; i++) {
                if (Arrays.deepEquals(mat, target)) return true;
                rotate(mat);
            }
            return false;
        }

        public void rotate(int[][] matrix) {
            int left = 0;
            int right = matrix.length - 1;

            while (left < right) {
                for (int i = 0; i < right - left; i++) {
                    int top = left;
                    int bottom = right;

                    int temp = matrix[top][left + i];

                    matrix[top][left + i] = matrix[bottom - i][left];
                    matrix[bottom - i][left] = matrix[bottom][right - i];
                    matrix[bottom][right - i] = matrix[top + i][right];
                    matrix[top + i][right] = temp;
                }
                left++;
                right--;
            }
        }
    }
}