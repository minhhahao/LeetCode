package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No87ScrambleString;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-24
 * Time: 10:44 AM
 */
public class No87Test {
    No87ScrambleString test;

    @Before
    public void setUp() {
        test = new No87ScrambleString();
    }

    @Test
    public void testFixed() {
        String s1 = "great";
        String s2 = "rgeat";
        String s3 = "rgtae";

        assertEquals(true, test.isScramble(s1, s2));
//        assertEquals(true, test.isScramble(s1, s3));
    }
}
