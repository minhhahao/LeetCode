package com.hazza.LeetCodeByJava.SegmentOne;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/#/description
 */
public class No36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length < 3) return false;
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> boxSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                //row
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) return false;
                //column
                if (board[j][i] != '.' && !colSet.add(board[j][i])) return false;
                //box
                int rowIndex = (i / 3) * 3 + j / 3;
                int colIndex = (i % 3) * 3 + j % 3;
                if (board[rowIndex][colIndex] != '.' && !boxSet.add(board[rowIndex][colIndex])) return false;
            }
        }

        return true;
    }
}
