package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/20/17.
 */
public class No35Test {
    No35SearchInsertPosition test;
    int[] nums = {1, 3, 5, 6};

    @Before
    public void setUp() {
        test = new No35SearchInsertPosition();
    }

    @Test
    public void testFind() {
        assertEquals(2, test.searchInsert(nums, 5));
    }

    @Test
    public void testNonFind() {
        assertEquals(2, test.searchInsert(nums, 4));
    }

    @Test
    public void testHead() {
        assertEquals(0, test.searchInsert(nums, 0));
    }

    @Test
    public void testTail() {
        assertEquals(4, test.searchInsert(nums, 7));
    }
}
