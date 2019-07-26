package com.hazza.leetcode.SegmentFour;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-10
 * Time: 8:43 PM
 */
public class No154FindMinimumInRotatedSortedArrayII {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] < nums[right]) {
                return nums[left];
            }

            int mid = (right - left) / 2 + left;
            if (nums[mid] > nums[left]) {
                left = mid + 1;
            } else if (nums[mid] < nums[left]){
                right = mid;
            } else {
                ++left;
            }
        }

        return nums[left];
    }

}


