package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No81SearchInRotatedSortedArrayII;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-04
 * Time: 9:31 AM
 */
public class No81Test {
    No81SearchInRotatedSortedArrayII test;


    @Before
    public void setUp() {
        test = new No81SearchInRotatedSortedArrayII();
    }


    @Test
    public void testTwo() {
        int[] nums = {3, 1};
        assertEquals(true, test.search(nums, 3));
        assertEquals(true, test.search(nums, 1));
    }

    @Test
    public void testSearch() {
        int[] nums = {4, 4, 5, 6, 6, 8, 0 , 1, 1, 2, 2};
        assertEquals(true, test.search(nums, 4));
        assertEquals(true, test.search(nums, 5));
        assertEquals(true, test.search(nums, 6));
        assertEquals(true, test.search(nums, 8));
        assertEquals(true, test.search(nums, 0));
        assertEquals(true, test.search(nums, 1));
        assertEquals(true, test.search(nums, 2));
        assertEquals(false, test.search(nums, 7));
        assertEquals(false, test.search(nums, 3));
    }

    @Test
    public void testDuplicates() {
        int[] nums = {4, 4, 4, 4, 5, 6, 6, 8, 0 , 1, 1, 2, 2, 4};
        assertEquals(true, test.search(nums, 4));
        assertEquals(true, test.search(nums, 5));
        assertEquals(true, test.search(nums, 6));
        assertEquals(true, test.search(nums, 8));
        assertEquals(true, test.search(nums, 0));
        assertEquals(true, test.search(nums, 1));
        assertEquals(true, test.search(nums, 2));
        assertEquals(false, test.search(nums, 7));
        assertEquals(false, test.search(nums, 3));
    }
}
