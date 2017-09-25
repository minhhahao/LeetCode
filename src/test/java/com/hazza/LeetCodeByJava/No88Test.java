package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-25
 * Time: 9:14 AM
 */
public class No88Test {
    No88MergeSortedArray test;

    private String arr2str(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + " ");
        }
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No88MergeSortedArray();
    }

    @Test
    public void testMerge() {
        int[] nums1 = new int[7];
        nums1[0] = 2;
        nums1[1] = 12;
        nums1[2] = 23;
        int[] nums2 = new int[4];
        nums2[0] = 1;
        nums2[1] = 12;
        nums2[2] = 16;
        nums2[3] = 29;
        test.merge(nums1, 3, nums2, 4);
        assertEquals("1 2 12 12 16 23 29 ", arr2str(nums1));

    }
}
