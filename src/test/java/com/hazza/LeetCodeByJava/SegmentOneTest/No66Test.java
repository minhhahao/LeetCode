package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No66PlusOne;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-21
 * Time: 10:25 AM
 */
public class No66Test {
    No66PlusOne test;

    private String array2string(int[] num) {
        StringBuilder sb = new StringBuilder();
        for (int i: num) sb.append(i);
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No66PlusOne();
    }

    @Test
    public void testSimple() {
        int[] num = new int[]{1, 2, 3, 4, 9};
        assertEquals("12350", array2string(test.plusOne(num)));
    }

    @Test
    public void testFull() {
        int[] num = new int[]{9, 9, 9, 9};
        assertEquals("10000", array2string(test.plusOne(num)));
    }
}
