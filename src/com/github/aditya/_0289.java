package com.github.aditya;

public class _0289 {
    // 0 ms, faster than 100.00%, memory 40.3 MB, less than 92.82%
    // Time Complexity ~ O(m * n) and Space Complexity O(1)
    // Before | After |  Code
    //    0   |   0   |   0
    //    1   |   0   |   1
    //    0   |   1   |   2
    //    1   |   1   |   3
    class Solution {
        public void gameOfLife(int[][] board) {
            int rows = board.length;
            int columns = board[0].length;

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    int count = countNeighbours(r, c, board);

                    if (board[r][c] == 1) {
                        if (count == 2 || count == 3)
                            board[r][c] = 3;
                    } else if (count == 3)
                        board[r][c] = 2;
                }
            }
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    if (board[r][c] == 1)
                        board[r][c] = 0;
                    else if (board[r][c] == 2 || board[r][c] == 3)
                        board[r][c] = 1;
                }
            }
        }

        public int countNeighbours(int row, int col, int[][] board) {
            int count = 0;

            for (int i = row - 1; i < row + 2; i++)
                for (int j = col - 1; j < col + 2; j++) {
                    if ((i == row && j == col) || i < 0 || j < 0 || i >= board.length || j >= board[0].length)
                        continue;
                    if (board[i][j] == 1 || board[i][j] == 3)
                        count++;
                }

            return count;
        }
    }
}