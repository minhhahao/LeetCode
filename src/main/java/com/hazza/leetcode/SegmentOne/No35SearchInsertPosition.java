package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/search-insert-position/#/description
 */
public class No35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        if (target < nums[left]) return left;
        if (target > nums[right]) return right + 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] > target) right = middle - 1;
            else left= middle + 1;
        }
        return left;
    }
}
