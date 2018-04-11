package com.hazza.LeetCodeByJava.SegmentFourTest;

import com.hazza.LeetCodeByJava.SegmentFour.No153FindMinimumInRotatedSortedArray;
import com.hazza.LeetCodeByJava.SegmentFour.No154FindMinimumInRotatedSortedArrayII;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-9
 * Time: 9:17 AM
 */
public class No154Test {
    No154FindMinimumInRotatedSortedArrayII test;

    @Before
    public void setUp() {
        test = new No154FindMinimumInRotatedSortedArrayII();
    }

    @Test
    public void test() {
        int[] nums1 = {4, 5, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 1, 2};
        int[] nums3 = {4, 5, 6, 7, 0, 0, 1, 1, 2};

        assertEquals(0, test.findMin(nums1));
        assertEquals(0, test.findMin(nums2));
        assertEquals(0, test.findMin(nums3));
    }

    @Test
    public void testDuplicates() {
        int[] nums = {10, 1, 10, 10, 10};

        assertEquals(1, test.findMin(nums));
    }
}
