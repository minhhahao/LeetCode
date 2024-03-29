package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/sudoku-solver/#/description
 */
public class No37SudokuSolver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length ==0) return;
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) return true;
                            else board[i][j] = '.';     //go back
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }

    private boolean isValid(char board[][], int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.' && board[row][i] == c) return false;
            if (board[i][col] != '.' && board[i][col] == c) return false;
            int rowIndex = (row / 3) * 3 + i / 3;
            int colIndex = (col / 3) * 3 + i % 3;
            if (board[rowIndex][colIndex] != '.' && board[rowIndex][colIndex] == c) return  false;
        }
        return true;
    }
}
