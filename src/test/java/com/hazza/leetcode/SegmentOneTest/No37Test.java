package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No37SudokuSolver;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/22/17.
 */
public class No37Test {
    No37SudokuSolver test;
    char[][] board;

    private char[][] generateBoard(String[] board) {
        char res[][] = new char[9][9];
        for (int i = 0; i < 9; i++)
            res[i] = board[i].toCharArray();

        return res;
    }

    private String outPutStringArray(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]);
        return sb.toString();
    }

    private String outPutCharArray(char[][] arr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                sb.append(arr[i][j]);
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No37SudokuSolver();
    }

    @Test
    public void testSolve() {
        String[] sudoku = {"..9748...","7........", ".2.1.9...",
                "..7...24.",".64.1.59.", ".98...3..",
                "...8.3.2.","........6","...2759.."};
        String[] answer = {"519748632", "783652419", "426139875",
                "357986241", "264317598", "198524367",
                "975863124", "832491756", "641275983"};
        char[][] board = generateBoard(sudoku);
        test.solveSudoku(board);
        assertEquals(outPutStringArray(answer), outPutCharArray(board));
    }
}
