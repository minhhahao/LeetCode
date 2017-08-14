package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDtoStringEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-14
 * Time: 8:56 AM
 */
public class No59Test {
    No59SpiralMatrixII test;

    private String arr2Str(int[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            sb.append(Arrays.toString(arr[i]));
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No59SpiralMatrixII();
    }

    @Test
    public void testThree() {
        int[][] right = new int[3][3];
        right[0] = new int[]{1, 2, 3};
        right[1] = new int[]{8, 9, 4};
        right[2] = new int[]{7, 6, 5};
        assertEquals(arr2Str(right), arr2Str(test.generateMatrix(3)));
    }

    @Test
    public void testLarge() {
        int[][] res = test.generateMatrix(10);
        for (int[] row: res) {
            for (int col : row)
                System.out.print((col < 10 ? "  " + col : (col < 100 ? " " + col : "" + col)));
            System.out.println();
        }
    }
}
