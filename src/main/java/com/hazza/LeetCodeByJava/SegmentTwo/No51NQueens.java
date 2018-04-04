package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-queens/description/
 */
public class No51NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if (n <= 0) return res;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';

        placeQueens(res, board, 0);

        return res;
    }

    private void placeQueens(List<List<String>> res, char[][] board, int colIndex) {
        int len = board.length;
        if (colIndex == len) {
            res.add(construct(board));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (isSafe(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                placeQueens(res, board, colIndex + 1);
                board[i][colIndex] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int rowIndex, int colIndex) {
        int len = board.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < colIndex; j++) {
                if (board[i][j] == 'Q' &&
                        (rowIndex == i ||
                                rowIndex - colIndex == i - j ||
                                rowIndex + colIndex == i + j))
                    return false;
            }
        }        
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        int len = board.length;
        for (int i = 0; i < len; i++)
            res.add(new String(board[i]));

        return res;
    }

}
