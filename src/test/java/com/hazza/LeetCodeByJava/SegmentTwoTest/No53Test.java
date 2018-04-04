package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No53MaximumSubarray;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-09
 * Time: 8:57 AM
 */
public class No53Test {
    No53MaximumSubarray test;
    int[] nums;

    @Before
    public void setUp() {
        test = new No53MaximumSubarray();
        nums = new int[100000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;
            int flag = random.nextInt(2);
            nums[i] = (flag == 0 ? random.nextInt(100) + 1 : random.nextInt(100) * (-1) - 1);
        }
    }

    @Test
    public void testTwo() {
        int[] nums1 = new int[]{-2, 1};
        int[] nums2 = new int[]{2, 1};


        assertEquals(1, test.maxSubArray(nums1));
        assertEquals(3, test.maxSubArray(nums2));
    }

    @Test
    public void testFixed() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        assertEquals(6, test.maxSubArray(nums));
    }

    @Test
    public void testRandom() {
        System.out.println(test.maxSubArray(nums));
    }
}
