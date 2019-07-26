package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No54SpiralMatrix;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-10
 * Time: 9:06 AM
 */
public class No54Test {
    No54SpiralMatrix test;
    int[][] nums = {{1, 2, 3 }, {4, 5, 6}, {7, 8, 9 }};

    private String list2str(List<Integer> l) {
        StringBuilder sb = new StringBuilder();
        for (Integer i: l) sb.append(i);
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No54SpiralMatrix();
    }

    @Test
    public void testSpiral() {
        List<Integer> right = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(list2str(right), list2str(test.spiralOrder(nums)));
    }

    @Test
    public void testSingleLine() {
        int[][] num = {{6, 9, 7}};
        assertEquals("697", list2str(test.spiralOrder(num)));
    }

}
