package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No52NQueensII;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 8/5/17.
 */
public class No52Test {
    No52NQueensII test;

    @Before
    public void setUp() {
        test = new No52NQueensII();
    }

    @Test
    public void test4Queens() {
        assertEquals(2, test.totalNQueens(4));
    }

    @Test
    public void test8Queens() {
        assertEquals(92, test.totalNQueens(8));
    }
}
