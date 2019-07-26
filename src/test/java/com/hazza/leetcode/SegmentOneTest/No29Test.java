package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No29DivideTwoIntegers;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/15/17.
 */
public class No29Test {
    @Test
    public void testOverFlow() {
        No29DivideTwoIntegers test = new No29DivideTwoIntegers();
        assertEquals(Integer.MIN_VALUE, test.divide(Integer.MIN_VALUE, 1));
        assertEquals(Integer.MAX_VALUE, test.divide(Integer.MIN_VALUE, -1));

    }

    @Test
    public void testDivideZero() {
        No29DivideTwoIntegers test = new No29DivideTwoIntegers();
        assertEquals(Integer.MAX_VALUE, test.divide(22, 0));
    }

    @Test
    public void testDivide() {
        No29DivideTwoIntegers test = new No29DivideTwoIntegers();
        assertEquals(3, test.divide(15, 5));
        assertEquals(3, test.divide(18, 5));
        assertEquals(-3, test.divide(-16, 5));
    }
}
