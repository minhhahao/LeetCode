package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/maximum-subarray/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-09
 * Time: 8:45 AM
 */
public class No53MaximumSubarray {
    //solution 1
    public int maxSubArray1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length, max = nums[0];
        int dp[] = new int[len];
        dp[0] = max;
        for (int i = 1; i < len; i++) {
            dp[i] = nums[i] + (dp[i - 1] <= 0 ? 0 : dp[i - 1]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    //solution 2
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length, curMax = nums[0], max = nums[0];
        for (int i = 1; i < len; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            max = Math.max(curMax, max);
        }

        return max;
    }

}
