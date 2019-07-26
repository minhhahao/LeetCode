package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No65ValidNumber;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-20
 * Time: 9:36 AM
 */
public class No65Test {
    No65ValidNumber test;

    @Before
    public void setUp() {
        test = new No65ValidNumber();
    }

    @Test
    public void testMany() {
        String s1 = "e9";
        String s2 = "-1.";
        assertEquals(false, test.isNumber(s1));
        assertEquals(true, test.isNumber(s2));
    }
}
