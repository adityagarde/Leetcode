package com.github.aditya;

public class _0074 {
    class Solution {
        // 0 ms, faster than 100.00%, Memory 38.2 MB, less than 90.45%, O(log(m * n))
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix.length == 0)
                return false;
            int m = matrix[0].length;
            int n = matrix.length;

            int left = 0;
            int right = (m * n) - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[mid / m][mid % m] == target) {
                    return true;
                } else if (matrix[mid / m][mid % m] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return false;
        }
    }


    // 0 ms, faster than 100.00%, Memory 38.1 MB, less than 90.45%, O(m+n)
    class Solution_1 {
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