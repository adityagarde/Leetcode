package com.github.aditya;

public class _0304 {
    // 127 ms, faster than 96.05%, memory 68.4 MB, less than 77.61%
    // Prefix Sum across the row and for the column such that any rectangle's right corner's immediate above neighbour
    // gives the cumulative sum of the above rectangle.
    // Final Sum = Total sum given by right bottom element - removing extra sums of rectangle above and to the left +
    // adding back the sum which was deducted twice i.e. rectangle to the top left corner of required matrix.
    class NumMatrix {
        private final int[][] sumMatrix;

        public NumMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] += matrix[i][j - 1];
                }
            }

            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
            this.sumMatrix = matrix;
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int matrixTotal = sumMatrix[row2][col2];
            int extraSum = ((col1 != 0) ? sumMatrix[row2][col1 - 1] : 0) + ((row1 != 0) ? sumMatrix[row1 - 1][col2] : 0);
            int sumSubtractedTwice = (row1 != 0 && col1 != 0) ? sumMatrix[row1 - 1][col1 - 1] : 0;

            return matrixTotal - extraSum + sumSubtractedTwice;
        }
    }

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
}