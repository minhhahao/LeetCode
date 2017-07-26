package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/26/17.
 */
public class No41Test {
    No41FirstMissingPositive test;

    @Before
    public void setUp() {
        test = new No41FirstMissingPositive();
    }

    @Test
    public void testNonPositive() {
        int[] nums = {1, 2, 0};
        assertEquals(3, test.firstMissingPositive(nums));
    }

    @Test
    public void testSpilt() {
        int[] nums = {3, 4, -1, 1};
        assertEquals(2, test.firstMissingPositive(nums));
    }

    @Test
    public void testOutOfLen() {
        int[] nums = {3, 7, 1, 2};
        assertEquals(4, test.firstMissingPositive(nums));
    }
}
