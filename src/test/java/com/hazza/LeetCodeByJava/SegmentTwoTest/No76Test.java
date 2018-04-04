package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No76MinimumWindowSubstring;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-29
 * Time: 10:59 AM
 */
public class No76Test {
    No76MinimumWindowSubstring test;

    @Before
    public void setUp() {
        test = new No76MinimumWindowSubstring();
    }

    @Test
    public void testFixed() {
        String S = "ADOBECODEBANC";
        String T = "ABC";

        assertEquals("BANC", test.minWindow(S, T));
        assertEquals(test.minWindow(S, T), test.minWindow1(S, T));
    }
}
