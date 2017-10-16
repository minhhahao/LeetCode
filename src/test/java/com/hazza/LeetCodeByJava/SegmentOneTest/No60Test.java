package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No60PermutationSequence;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-16
 * Time: 10:34 AM
 */
public class No60Test {
    No60PermutationSequence test;

    @Before
    public void setUp() {
        test = new No60PermutationSequence();
    }

    @Test
    public void testThree() {
        assertEquals("123", test.getPermutation(3, 1));
        assertEquals("132", test.getPermutation(3, 2));
        assertEquals("213", test.getPermutation(3, 3));
        assertEquals("231", test.getPermutation(3, 4));
        assertEquals("312", test.getPermutation(3, 5));
        assertEquals("321", test.getPermutation(3, 6));
    }
}
