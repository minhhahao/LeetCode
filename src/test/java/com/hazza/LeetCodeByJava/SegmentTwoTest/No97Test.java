package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No97InterleavingString;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-12
 * Time: 6:44 PM
 */
public class No97Test {
    No97InterleavingString test;

    @Before
    public void setUp() {
        test = new No97InterleavingString();
    }

    @Test
    public void testSome() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        String s4 = "aadbbbaccc";

        assertEquals(true, test.isInterleave(s1, s2, s3));
        assertEquals(false, test.isInterleave(s1, s2, s4));
    }
}
