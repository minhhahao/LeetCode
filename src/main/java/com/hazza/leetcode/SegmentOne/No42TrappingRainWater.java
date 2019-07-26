package com.hazza.leetcode.SegmentOne;

import java.util.Stack;

/**
 * https://leetcode.com/problems/trapping-rain-water/#/description
 */
public class No42TrappingRainWater {
    // solution 1
    public int trap(int[] height) {
        int res = 0;
        if (height == null || height.length <= 2) return res;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else res += leftMax - height[left];
                ++left;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else res += rightMax - height[right];
                --right;
            }
        }

        return res;
    }

    // solution 2
    public int trap2(int[] height) {
        int res = 0;
        if (height == null || height.length <= 2) return res;
        Stack<Integer> stack = new Stack<>();
        int i = 0, bottomWater = 0, len = height.length;
        while (i < len) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) stack.push(i++);
            else {
                int bottom = stack.pop();   //get the index of trap
                bottomWater = stack.isEmpty() ? 0 :
                        ((Math.min(height[stack.peek()], height[i]) - height[bottom]) * (i - stack.peek() - 1));
                res += bottomWater;
            }
        }

        return res;
    }
}
