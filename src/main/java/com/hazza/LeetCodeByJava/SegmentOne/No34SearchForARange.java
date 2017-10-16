package com.hazza.LeetCodeByJava.SegmentOne;

/**
 * Created by hazza on 7/19/17.
 */
public class No34SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0) return res;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;    //保证middle出现在左侧
            if (nums[middle] < target) left = middle + 1;
            else right = middle;    //不判断nums[middle] == target来保证最左边是range的开始
        }

        if (nums[left] != target) return res;
        else res[0] = left;

        right = nums.length - 1;
        while (left < right) {
            int middle = (left + right + 1) / 2; //保证middle出现在右侧
            if (nums[middle] > target) right = middle - 1;
            else left = middle;     //不判断nums[middle] == target来保证最右边是range的结束
        }
        res[1] = right;

        return res;
    }
}
