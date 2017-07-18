package com.hazza.LeetCodeByJava;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/18/17.
 */
public class No33Test {
    @Test
    public void testSearch() {
        No33SearchInRotatedSortedArray test = new No33SearchInRotatedSortedArray();
        int[] nums = {4, 5, 6, 8, 0 ,1, 2};
        assertEquals(0, test.search(nums, 4));
        assertEquals(1, test.search(nums, 5));
        assertEquals(2, test.search(nums, 6));
        assertEquals(3, test.search(nums, 8));
        assertEquals(4, test.search(nums, 0));
        assertEquals(5, test.search(nums, 1));
        assertEquals(6, test.search(nums, 2));
        assertEquals(-1, test.search(nums, 7));
        assertEquals(-1, test.search(nums, 3));
    }
}
