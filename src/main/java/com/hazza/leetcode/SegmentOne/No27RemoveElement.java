package com.hazza.leetcode.SegmentOne;

/**
 * Created by hazza on 7/14/17.
 */
public class No27RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int count = 0, len = nums.length;
        for (int i = 0; i < len; i++)
            if (nums[i] != val) nums[count++] = nums[i];

        return count;
    }
}
