package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No42TrappingRainWater;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/27/17.
 */
public class No42Test {
    No42TrappingRainWater test;

    @Before
    public void setUp() {
        test = new No42TrappingRainWater();
    }

    @Test
    public void testMany() {
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {5, 4, 1, 2};

        assertEquals(6, test.trap(height1));
        assertEquals(1, test.trap(height2));
    }
}
