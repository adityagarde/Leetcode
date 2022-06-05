package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0052 {
    // 6 ms, faster than 40.24%, memory 41.5 MB, less than 36.03%
    class Solution {
        int result = 0;

        public int totalNQueens(int n) {
            char[][] board = new char[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    board[i][j] = '.';

            List<int[]> queens = new ArrayList<>();
            dfs(0, queens, board);

            return result;
        }

        private void dfs(int row, List<int[]> queens, char[][] board) {
            if (queens.size() == board.length) {
                result++;
                return;
            }

            for (int col = 0; col < board.length; col++) {
                if (isSafe(row, col, queens)) {
                    board[row][col] = 'Q';
                    queens.add(new int[]{row, col});
                    dfs(row + 1, queens, board);
                    board[row][col] = '.';
                    queens.remove(queens.size() - 1);
                }
            }
        }

        private boolean isSafe(int row, int col, List<int[]> queens) {
            for (int[] queen : queens) {
                int dx = Math.abs(row - queen[0]);
                int dy = Math.abs(col - queen[1]);
                if (dx == 0 || dy == 0 || dx == dy)
                    return false;
            }
            return true;
        }
    }
}