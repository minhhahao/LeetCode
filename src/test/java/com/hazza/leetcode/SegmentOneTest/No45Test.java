package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No45JumpGameII;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 8/8/17.
 */
public class No45Test {
    No45JumpGameII test;
    int[] nums;

    @Before
    public void setUp() {
        test = new No45JumpGameII();
        nums = new int[10000000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(400) + 1;
        }
    }

    @Test
    public void testTow() {
        int[] nums = {2, 3, 1, 1, 4};
        assertEquals(2, test.jump(nums));
    }

    @Test(timeout = 3)
    public void testTLE() {
        int[] nums = {5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5};
        System.out.println(test.jump(nums));
    }

    @Test
    public void testRandom() {
        System.out.println(test.jump(nums));
    }
}
