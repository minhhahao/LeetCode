package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/28/17.
 */
public class No43Test {
    No43MultiplyStrings test;

    @Before
    public void setUp() {
        test = new No43MultiplyStrings();
    }

    @Test
    public void testZero() {
        assertEquals("0", test.multiply("0", "0"));
        assertEquals("0", test.multiply("0", "34"));
        assertEquals("0", test.multiply("21", "0"));
    }

    @Test
    public void testRealMultiply() {
        String right = String.valueOf(19282 * 342);
        assertEquals(right, test.multiply("19282", "342"));
    }
}
