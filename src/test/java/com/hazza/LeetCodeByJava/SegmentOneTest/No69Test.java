package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No69SqrtX;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-23
 * Time: 10:05 AM
 */
public class No69Test {
    No69SqrtX test;

    @Before
    public void setUp() {
        test = new No69SqrtX();
    }

    @Test
    public void testSome() {
        assertEquals(1, test.mySqrt(2));
        assertEquals(1, test.mySqrt(3));
        assertEquals(2, test.mySqrt(4));
        assertEquals(2, test.mySqrt(5));
        assertEquals(2, test.mySqrt(6));
        assertEquals(2, test.mySqrt(7));
        assertEquals(2, test.mySqrt(8));
        assertEquals(3, test.mySqrt(9));
        assertEquals(3, test.mySqrt(10));
    }
}
