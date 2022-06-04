package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0051 {
    // 6 ms, faster than 54.26%, memory 43 MB, less than 76.62%
    class Solution {
        private List<List<String>> result;

        public List<List<String>> solveNQueens(int n) {
            result = new ArrayList<>();
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
                List<String> rows = new ArrayList<>();
                for (char[] ch : board)
                    rows.add(new String(ch));
                result.add(rows);
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