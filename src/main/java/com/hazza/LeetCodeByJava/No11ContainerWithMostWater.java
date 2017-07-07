package com.hazza.LeetCodeByJava;

/**
 * https://leetcode.com/problems/container-with-most-water/#/description
 */
public class No11ContainerWithMostWater {
    public int maxArea(int[] height) {
        int res = 0, left = 0, right = height.length - 1;
        while (left != right) {
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) ++left;
            else --right;
        }
        return res;
    }

}
