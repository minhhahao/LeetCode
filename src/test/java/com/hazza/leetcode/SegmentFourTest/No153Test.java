package com.hazza.leetcode.SegmentFourTest;

import com.hazza.leetcode.SegmentFour.No153FindMinimumInRotatedSortedArray;
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
public class No153Test {
    No153FindMinimumInRotatedSortedArray test;

    @Before
    public void setUp() {
        test = new No153FindMinimumInRotatedSortedArray();
    }

    @Test
    public void test() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        assertEquals(0, test.findMin(nums));
    }
}
