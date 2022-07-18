package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _1074 {
    // 188 ms, faster than 77.67%, memory 42.5 MB, less than 99.26%
    // Time Complexity (m * n ^2) and Space Complexity O(n)
    // First find the Prefix Sum for every row.
    // And then for each pair of columns (c1, c2) find the subarray sum equal to target.
    // HashMap to store the (Sum, Count) pair. This ques is 2D version of LC 560.
    class Solution {
        public int numSubmatrixSumTarget(int[][] matrix, int target) {
            int count = 0;
            int m = matrix.length, n = matrix[0].length;

            for (int row = 0; row < m; row++)
                for (int col = 1; col < n; col++)
                    matrix[row][col] += matrix[row][col - 1];


            for (int c1 = 0; c1 < n; c1++) {
                for (int c2 = c1; c2 < n; c2++) {
                    int sum = 0;
                    Map<Integer, Integer> map = new HashMap<>(); // SUM # COUNT
                    map.put(0, 1);

                    for (int row = 0; row < m; row++) {
                        sum += matrix[row][c2] - (c1 > 0 ? matrix[row][c1 - 1] : 0);
                        count += map.getOrDefault(sum - target, 0);
                        map.put(sum, map.getOrDefault(sum, 0) + 1);
                    }
                }
            }
            return count;
        }
    }
}