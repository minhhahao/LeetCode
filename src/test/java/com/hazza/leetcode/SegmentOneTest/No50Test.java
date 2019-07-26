package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No50Pow;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 8/2/17.
 */
public class No50Test {
    No50Pow test;

    @Before
    public void setUp() {
        test = new No50Pow();
    }

    @Test
    public void testNZero() {
        assertEquals(1.0, test.myPow(0.0, 0));
        assertEquals(1.0, test.myPow(2.1, 0));
        assertEquals(1.0, test.myPow(-3.2, 0));
    }

    @Test
    public void testXZero() {
        assertEquals(1.0, test.myPow(0.0, 0));
        assertEquals(0.0, test.myPow(0.0, 2));
        assertEquals(1.0 / 0.0, test.myPow(0.0, -2));
    }

    @Test
    public void testXOne() {
        assertEquals(Math.pow(1.0000, -2147483648), test.myPow(1.00000, -2147483648));
        assertEquals(Math.pow(-1.0000, -2147483648), test.myPow(-1.00000, -2147483648));
    }

    @Test
    public void testNormal() {
        assertEquals(Math.pow(3.3, 13), test.myPow(3.3, 13));
        assertEquals(Math.pow(-12.2, -4), test.myPow(-12.2, -4));
    }

    @Test
    public void testTimeLimited() {
        assertEquals(Math.pow(0.00001, 2147483647), test.myPow(0.00001, 2147483647));
    }

    @Test
    public void testOverFlow() {
        assertEquals(Math.pow(2.0000, -2147483648), test.myPow(2.00000, -2147483648));
    }
}
