package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No67AddBinary;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-21
 * Time: 11:03 AM
 */
public class No67Test {
    No67AddBinary test;

    @Before
    public void setUp() {
        test = new No67AddBinary();
    }

    @Test
    public void testSimple() {
        assertEquals("1010", test.addBinary("111", "11"));
        assertEquals("111", test.addBinary("100", "11"));
        assertEquals("111", test.addBinary("11", "100"));
        assertEquals("1000", test.addBinary("101", "11"));
        assertEquals("100", test.addBinary("11", "1"));
    }

    @Test
    public void testLong() {
        assertEquals("110001", test.addBinary("101111", "10"));
    }
}
