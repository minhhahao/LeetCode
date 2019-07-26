package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No80RemoveDuplicatesFromSortedArrayII;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-02
 * Time: 11:45 AM
 */
public class No80Test {
    No80RemoveDuplicatesFromSortedArrayII test;

    @Before
    public void setUp() {
        test = new No80RemoveDuplicatesFromSortedArrayII();
    }

    @Test
    public void testRemove() {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3, 3};
        assertEquals(6, test.removeDuplicates(nums));
    }
}
