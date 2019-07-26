package com.hazza.leetcode.SegmentOne;

/**
 * Created by hazza on 7/13/17.
 */
public class No26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int count  = 1;
        for (int i = 1; i < len; i++)
            if (nums[i] != nums[i - 1]) nums[count++] = nums[i];

        return count;
    }
}
