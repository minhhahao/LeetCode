package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No64MinimumPathSum;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-19
 * Time: 9:27 AM
 */
public class No64Test {
    No64MinimumPathSum test;

    @Before
    public void settUp() {
        test = new No64MinimumPathSum();
    }

    @Test
    public void testOne() {
        int[][] nums = new int[1][1];
        nums[0][0] = 0;

        assertEquals(0, test.minPathSum(nums));
    }

    @Test
    public void testTwo() {
        int[][] nums = new int[2][2];
        nums[0] = new int[]{1, 2};
        nums[1] = new int[]{1, 1};

        assertEquals(3, test.minPathSum(nums));
    }
}
