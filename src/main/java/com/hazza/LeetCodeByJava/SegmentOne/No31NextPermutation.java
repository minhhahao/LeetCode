package com.hazza.LeetCodeByJava.SegmentOne;

import java.util.Arrays;

/**
 * Created by hazza on 7/17/17.
 */
public class No31NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return;
        int len = nums.length, i, j;
        for (i = len - 1; i > 0; i--)
            if (nums[i] > nums[i - 1]) break;
        if (i > 0) {
            for (j = len - 1; j > i - 1; j--)
                if (nums[j] > nums[i - 1]) break;
            swap(nums, j, i -1);
        }
        reverse(nums, i, len - 1);
    }

    private void swap(int[] nums, int i, int j) {
        if (nums[i] != nums[j]) {
            nums[i] = nums[i] ^ nums[j];
            nums[j] = nums[j] ^ nums[i];
            nums[i] = nums[i] ^ nums[j];
        }
    }

    private void reverse(int[] nums, int start, int end) {
        if (start > end) return;
        for (int i = start; i <= (start + end) / 2; i++)
            swap(nums, i, end - i + start);
    }
}
