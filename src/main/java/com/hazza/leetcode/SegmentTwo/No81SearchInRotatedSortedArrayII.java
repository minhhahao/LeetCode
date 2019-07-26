package com.hazza.leetcode.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-04
 * Time: 9:10 AM
 */
public class No81SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return true;
            if (nums[left] < nums[middle]) {
                if (target >= nums[left] && target < nums[middle]) right = middle - 1;
                else left = middle + 1;
            } else if (nums[left] > nums[middle]) {
                if (target > nums[middle] && target <= nums[right]) left = middle + 1;
                else right = middle - 1;
            } else ++left;
        }

        return nums[left] == target;
    }
}
