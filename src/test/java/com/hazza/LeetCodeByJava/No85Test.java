package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-14
 * Time: 10:29 PM
 */
public class No85Test {
    No85MaximalRectangle test;

    @Before
    public void setUp() {
        test = new No85MaximalRectangle();
    }

    @Test
    public void test1() {
        char[][] matrix = new char[3][7];
        matrix[0] = new char[]{'0', '0', '0', '1', '0', '0', '0'};
        matrix[1] = new char[]{'0', '0', '1', '1', '1', '0', '0'};
        matrix[2] = new char[]{'0', '1', '1', '1', '1', '1', '0'};
        assertEquals(6, test.maximalRectangle(matrix));

    }
}
