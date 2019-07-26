package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No34SearchForARange;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/19/17.
 */
public class No34Test {
    No34SearchForARange test;
    int[] nums= {5, 7, 7, 8, 8, 10};

    private String outPutArray(int[] nums) {
        StringBuffer sb = new StringBuffer();
        for (int num : nums) sb.append(num + " ");
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No34SearchForARange();
    }

    @Test
    public void testFindNon() {
        int[] right = {-1, -1};
        assertEquals(outPutArray(right), outPutArray(test.searchRange(nums, 3)));
    }

    @Test
    public void testFindTwo() {
        int[] right = {3, 4};
        assertEquals(outPutArray(right), outPutArray(test.searchRange(nums, 8)));
    }

    @Test
    public void testFindSingle() {
        int[] right = {0, 0};
        assertEquals(outPutArray(right), outPutArray(test.searchRange(new int[]{1}, 1)));
    }

}
