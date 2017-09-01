package com.hazza.LeetCodeByJava;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/word-search/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-01
 * Time: 9:41 AM
 */
public class No79WordSearch {
    // solution 1
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) return false;
        boolean[][] used = new boolean[board.length][board[0].length];
        int rowLen = board.length, colLen = board[0].length;
        for (int i = 0; i < rowLen; i++)
            for (int j = 0; j < colLen; j++)
                if (board[i][j] == word.charAt(0) && search(board, used, i, j, word, 0))
                    return true;

        return false;
    }

    private boolean search(char[][] board, boolean[][] used, int row, int col, String word, int start) {
        if (start == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || used[row][col] || word.charAt(start) != board[row][col]) return false;

        used[row][col] = true;
        if (search(board, used,row - 1, col, word, start + 1) ||
                search(board, used, row + 1, col, word, start + 1) ||
                search(board, used, row,col - 1, word, start + 1) ||
                search(board, used, row,col + 1, word, start + 1)) {
            return true;
        }
        used[row][col] = false;

        return false;
    }

    // solution 2
    public boolean exist1(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) return false;
        int rowLen = board.length, colLen = board[0].length;
        for (int i = 0; i < rowLen; i++)
            for (int j = 0; j < colLen; j++)
                if (board[i][j] == word.charAt(0) && search(board, i, j, word, 0))
                    return true;

        return false;
    }

    private boolean search(char[][] board,int row, int col, String word, int start) {
        if (start == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || word.charAt(start) != board[row][col]) return false;

        board[row][col] ^= 256;
        boolean existed = (search(board, row - 1, col, word, start + 1) ||
                search(board, row + 1, col, word, start + 1) ||
                search(board, row, col - 1, word, start + 1) ||
                search(board, row, col + 1, word, start + 1));
        board[row][col] ^= 256;

        return existed;
    }
}
