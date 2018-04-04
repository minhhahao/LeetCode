package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-02
 * Time: 11:08 AM
 */
public class No80RemoveDuplicatesFromSortedArrayII {
    // solution 1
    public int removeDuplicates(int[] nums) {
        int count = 1, duplicates = 1, len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                ++duplicates;
                if (duplicates <= 2) nums[count++] = nums[i];
            }
            else {
                nums[count++] = nums[i];
                duplicates = 1;
            }
        }

        return count;
    }

    // solution 2
    public int removeDuplicates2(int[] nums) {
        int count = 0;
        for (int n: nums)
            if (count < 2 || n > nums[count - 2])
                nums[count++] = n;

        return count;
    }
}
