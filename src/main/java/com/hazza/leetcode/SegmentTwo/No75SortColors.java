package com.hazza.leetcode.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/sort-colors/discuss/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-28
 * Time: 9:43 AM
 */
public class No75SortColors {
    // solution 1
    public void sortColors(int[] nums) {
        int n0 = -1, n1 = -1, n2 = -1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                nums[++n2] = 2;
                nums[++n1] = 1;
                nums[++n0] = 0;
            } else if (nums[i] == 1) {
                nums[++n2] = 2;
                nums[++n1] = 1;
            } else if (nums[i] == 2) {
                nums[++n2] = 2;
            }
        }
    }

    // solution 2
    public void sortColors1(int[] nums) {
        int num0 = 0, num2 = nums.length - 1;
        for (int i = 0; i <= num2; i++) {
            if (nums[i] == 0 && i != num0) swap(nums, i--, num0++);
            else if (nums[i] == 2 && i != num2) swap(nums, i--, num2--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (nums[i] != nums[j]) {
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
