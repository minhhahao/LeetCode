package com.hazza.leetcode.SegmentFourTest;

import com.hazza.leetcode.SegmentFour.No152MaximumProductSubarray;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-8
 * Time: 9:14 AM
 */
public class No152Test {
    No152MaximumProductSubarray test;

    @Before
    public void setUp() {
        test = new No152MaximumProductSubarray();
    }

    @Test
    public void testZero() {
        int[] nums = {2, 0, -1};

        assertEquals(2, test.maxProduct(nums));
    }

    @Test
    public void test() {
        int[] nums = {2, 3, -2, 4};

        assertEquals(6, test.maxProduct(nums));
    }
}
