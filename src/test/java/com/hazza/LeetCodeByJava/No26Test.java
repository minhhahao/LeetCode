package com.hazza.LeetCodeByJava;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/13/17.
 */
public class No26Test {
    private boolean arrayEqual(int[] nums1, int[] nums2, int len) {
        for (int i = 0; i < len; i++)
            if (nums1[i] != nums2[i]) return false;
        return true;
    }

    @Test
    public void testEmpty() {
        No26RemoveDuplicatesFromSortedArray test = new No26RemoveDuplicatesFromSortedArray();
        int[] nums = new int[0];
        assertEquals(0, test.removeDuplicates(null));
        assertEquals(0, test.removeDuplicates(nums));
    }

    @Test
    public void testOne() {
        No26RemoveDuplicatesFromSortedArray test = new No26RemoveDuplicatesFromSortedArray();
        int[] nums = {1};
        assertEquals(1, test.removeDuplicates(nums));
    }

    @Test
    public void testMany() {
        No26RemoveDuplicatesFromSortedArray test = new No26RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 6};
        int[] res = {1, 2, 3, 4, 5, 6};
        int len = test.removeDuplicates(nums);
        assertEquals(6, len);
        assertEquals(true, arrayEqual(nums, res, len));
    }

}
