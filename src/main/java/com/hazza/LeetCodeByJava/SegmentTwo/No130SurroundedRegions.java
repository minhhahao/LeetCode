package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/surrounded-regions/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-4
 * Time: 2:09 PM
 */
public class No130SurroundedRegions {

    private void check(char[][] board, int i, int j, int rowLen, int colLen) {
        if (board[i][j] == 'O') {
            board[i][j] = '*';
            if (i > 1) check(board, i - 1, j, rowLen, colLen);
            if (j > 1) check(board, i, j -1, rowLen, colLen);
            if (i + 1 < rowLen) check(board, i + 1, j, rowLen, colLen);
            if (j + 1 < colLen) check(board, i, j + 1, rowLen, colLen);
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0) return;
        int rowLen = board.length, colLen = board[0].length;

        // check the first row and the last row
        for (int j = 0; j < colLen; j++) {
            check(board, 0, j, rowLen, colLen);
            if (rowLen > 1) check(board, rowLen - 1, j, rowLen, colLen);
        }
        // check the first column and the last column
        for (int i = 0; i < rowLen; i++) {
            check(board, i, 0, rowLen, colLen);
            if (colLen > 1) check(board, i, colLen - 1, rowLen, colLen);
        }
        // transfer
        for (int i = 0; i < rowLen; i++)
            for (int j = 0; j < colLen; j++)
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '*') board[i][j] = 'O';
    }
}
