package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No74SearchA2DMatrix;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-27
 * Time: 9:22 AM
 */
public class No74Test {
    No74SearchA2DMatrix test;
    private static final int[][] matrix = {
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
    };

    private boolean arrHasNum(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] == target) return true;
        return false;
    }

    @Before
    public void setUp() {
        test = new No74SearchA2DMatrix();
    }

    @Test
    public void testMany() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            assertEquals(arrHasNum(matrix, i), test.searchMatrix(matrix, i));
        }
    }
}
