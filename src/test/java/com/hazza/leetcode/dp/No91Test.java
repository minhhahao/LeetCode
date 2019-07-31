package com.hazza.leetcode.dp;

import com.hazza.leetcode.dp.No91DecodeWays;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-28
 * Time: 8:54 AM
 */
public class No91Test {
    No91DecodeWays test;

    @Before
    public void setUp() {
        test = new No91DecodeWays();
    }

    @Test
    public void testSome() {
        assertEquals(5, test.numDecodings("1111"));
        assertEquals(1, test.numDecodings("1101"));
        assertEquals(2, test.numDecodings("12"));
    }
}
