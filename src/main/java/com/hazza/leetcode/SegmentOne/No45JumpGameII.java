package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/jump-game-ii/description/
 */
public class No45JumpGameII {
    //solution 1
    public int jump(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int len = nums.length, preMax = 0, curMax= 0, steps = 0;
        for (int i = 0; i < len - 1; i++) {
            curMax = Math.max(curMax, nums[i] + i);
            if (i == preMax) {
                ++steps;
                preMax = curMax;
            }
        }

        return steps;
    }

    //solution 2
    public int jump2(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int len = nums.length;
        int curMax = 0, nextMax = 0, steps = 0, i = 0;
        while (curMax - i + 1 > 0) {
            ++steps;
            while (i <= curMax) {
                nextMax = Math.max(nextMax, nums[i] + i);
                if (nextMax >= len - 1) return steps;
                ++i;
            }
            curMax = nextMax;
        }
        return 0;
    }
}
