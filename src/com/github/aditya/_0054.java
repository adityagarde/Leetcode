package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0054 {
    // 0 ms, faster than 100.00%, memory 40.4 MB, less than 84.34%
    // Time Complexity O(M*N) and Space complexity O(1) (as we will not consider result)
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return result;

            int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++)
                    result.add(matrix[top][i]);
                top++;

                for (int i = top; i <= bottom; i++)
                    result.add(matrix[i][right]);
                right--;

                if (top > bottom || left > right)
                    break;

                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;

                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
            return result;
        }
    }
}