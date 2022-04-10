package com.github.aditya;

import java.util.Arrays;
import java.util.List;

public class _1260 {
    // 2 ms, faster than 99.61%, memory 42.9 MB, less than 87.98%
    // Time Complexity O(m * n) and Space Complexity - If we include result array O(m * n) else O(1).

    /**
     * Visualizing the (m * n) 2D matrix as an array of (m * n) length and the just handling the indices.
     *     0 1 2
     * 0 [ 1 2 3 ]  m = 3 rows            [ 9 1 2 ]
     * 1 [ 4 5 6 ]  n = 3 columns         [ 3 4 5 ]
     * 2 [ 7 8 9 ]        for k = 1 =>    [ 6 7 8 ]
     * [ 1 2 3 4 5 6 7 8 9 ]  ==>  [ 9 1 2 3 4 5 6 7 8 ]
     * 1. Ex - "6" i.e. (r = 1, c = 2) from original 2D Matrix maps to r * n + c location = 1 * 3 + 2 = 5
     * 2. Add "k" to this as we have to rotate k times and take mod with length so as to rearrange post spill.
     * 3. Convert this next Index (arrIndex) back to 2D coordinates => row = index / n && col = index % n (the offset).
     */
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;

            int[][] result = new int[m][n];
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    int arrIndex = (r * n + c + k) % (m * n);
                    int newRow = arrIndex / n;
                    int newCol = arrIndex % n;
                    result[newRow][newCol] = grid[r][c];
                }
            }
            return (List) Arrays.asList(result);
        }
    }
}