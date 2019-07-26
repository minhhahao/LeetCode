package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No38CountAndSay;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/23/17.
 */
public class No38Test {
    No38CountAndSay test;

    @Before
    public void setUp() {
        test = new No38CountAndSay();
    }

    @Test
    public void testMany() {
        String s1 = "1";
        String s2 = "11";
        String s3 = "21";
        String s4 = "1211";
        String s5 = "111221";
        assertEquals(s1, test.countAndSay(1));
        assertEquals(s2, test.countAndSay(2));
        assertEquals(s3, test.countAndSay(3));
        assertEquals(s4, test.countAndSay(4));
        assertEquals(s5, test.countAndSay(5));

    }
}
