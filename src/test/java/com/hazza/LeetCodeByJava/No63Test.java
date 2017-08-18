package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-18
 * Time: 7:29 PM
 */
public class No63Test {
    No63UniquePathsII test;

    @Before
    public void setUp() {
        test = new No63UniquePathsII();
    }

    @Test
    public void testThree() {
        int[][] nums = new int[3][3];
        nums[0] = new int[]{0, 0, 0};
        nums[1] = new int[]{0, 1, 0};
        nums[2] = new int[]{0, 0, 0};

        assertEquals(2, test.uniquePathsWithObstacles(nums));
    }

}
