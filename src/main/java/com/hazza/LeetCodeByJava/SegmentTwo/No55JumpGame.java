package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/jump-game/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-11
 * Time: 8:42 AM
 */
public class No55JumpGame {
    // solution 1
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int len = nums.length, curMax = nums[0];
        for (int i = 0; i < len && curMax >= i; i++) {
            curMax = Math.max(curMax, i + nums[i]);
            if (curMax >= len - 1) return true;
        }

        return false;
    }

    // solution 2
    public boolean canJump2(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int lastPos = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--)
            if (nums[i] + i >= lastPos) lastPos = i;

        return lastPos == 0;
    }
}
