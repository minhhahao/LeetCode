package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No79WordSearch;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-01
 * Time: 10:04 AM
 */
public class No79Test {
    No79WordSearch test;

    @Before
    public void setUp() {
        test = new No79WordSearch();
    }

    @Test
    public void test1() {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        assertEquals(true, test.exist(board, "ABCCED"));
        assertEquals(true, test.exist(board, "SEE"));
        assertEquals(true, test.exist(board, "FCS"));
        assertEquals(false, test.exist(board, "ABCB"));
        assertEquals(false, test.exist(board, "Z"));
        assertEquals(false, test.exist(board, "FDB"));
    }

    @Test
    public void test2() {
        char[][] board = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}};

        assertEquals(true, test.exist(board, "AAB"));
    }

    @Test
    public void test3() {
        char[][] board = {
                {'a','a','a', 'a'},
                {'a','a','a', 'a'},
                {'a','a','a', 'a'}};

        assertEquals(false, test.exist(board, "aaaaaaaaaaaaaa"));
    }

    @Test
    public void test4() {
        char[][] board = {{'a','a','a','a'}};

        assertEquals(false, test.exist(board, "aaaaaa"));
    }
}
