package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-15
 * Time: 5:28 PM
 */
public class No62Test {
    No62UniquePaths test;

    @Before
    public void setUp() {
        test = new No62UniquePaths();
    }

    @Test
    public void test2_2() {
        assertEquals(2, test.uniquePaths(2, 2));
    }

    @Test
    public void test3_2() {
        assertEquals(3, test.uniquePaths(2, 3));
        assertEquals(test.uniquePaths(2, 3), test.uniquePaths(3, 2));
    }

    @Test
    public void testRandom() {
        Random random = new Random();
        int row = random.nextInt(50) + 1;
        int col = random.nextInt(50) + 1;
        int res1 = test.uniquePaths(row, col);
        int res2 = test.uniquePaths(col, row);
        System.out.println(res1 + " " + res2);
        assertEquals(res1, res2);
    }
}
