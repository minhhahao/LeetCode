package com.hazza.leetcode.SegmentOne;

/**
 * Created by hazza on 7/18/17.
 */
public class No33SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (nums[left] <= nums[middle]) {
                if (target >= nums[left] && target < nums[middle]) right = middle - 1;
                else left = middle + 1;
            } else {
                if (target > nums[middle] && target <= nums[right]) left = middle + 1;
                else right = middle - 1;
            }
        }

        return nums[left] == target ? left : -1;
    }
}
