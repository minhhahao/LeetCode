package com.hazza.LeetCodeByJava.SegmentFour;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-9
 * Time: 9:04 AM
 */
public class No153FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] < nums[right]) {
                return nums[left];
            }

            int mid = (right - left) / 2 + left;
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
