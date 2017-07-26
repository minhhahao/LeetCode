package com.hazza.LeetCodeByJava;

/**
 * https://leetcode.com/problems/first-missing-positive/#/description
 */
public class No41FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) return 1;

        int i = 0, len = nums.length;
        while (i < len) {
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > len) ++i;
            else if (nums[nums[i] - 1] != nums[i]) swap(nums, i, nums[i] - 1);
            else ++i;
        }
        i = 0;
        while (i < len && nums[i] == i + 1) ++i;

        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
