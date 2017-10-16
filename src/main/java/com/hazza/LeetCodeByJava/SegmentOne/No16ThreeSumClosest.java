package com.hazza.LeetCodeByJava.SegmentOne;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/#/description
 */
public class No16ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) return 0;
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; ++i) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                res = Math.abs(res - target) < Math.abs(sum - target) ? res : sum;
                if (sum == target) return res;
                else if (sum < target) ++left;
                else --right;
            }
        }

        return res;
    }
}
