package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No31NextPermutation;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/17/17.
 */
public class No31Test {
    private String outPutArray(int[] nums) {
        StringBuffer sb = new StringBuffer();
        for (int num : nums) sb.append(num + " ");
        return sb.toString();
    }

    @Test
    public void testLargest() {
        No31NextPermutation test = new No31NextPermutation();
        int[] nums = {3, 2, 1};
        int[] right = {1, 2, 3};
        test.nextPermutation(nums);
        assertEquals(outPutArray(right), outPutArray(nums));
    }

    @Test
    public void testConected() {
        No31NextPermutation test = new No31NextPermutation();
        int[] nums = {1, 2, 3};
        int[] right = {1, 3, 2};
        test.nextPermutation(nums);
        assertEquals(outPutArray(right), outPutArray(nums));
    }

    @Test
    public void testSplited() {
        No31NextPermutation test = new No31NextPermutation();
        int[] nums = {2, 3, 1};
        int[] right = {3, 1, 2};
        test.nextPermutation(nums);
        assertEquals(outPutArray(right), outPutArray(nums));
    }

    @Test
    public void testComplex() {
        No31NextPermutation test = new No31NextPermutation();
        int[] nums = {2,2,7,5,4,3,2,2,1};
        int[] right = {2,3,1,2,2,2,4,5,7};
        test.nextPermutation(nums);
        assertEquals(outPutArray(right), outPutArray(nums));
    }
}
