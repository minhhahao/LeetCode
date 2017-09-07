package com.hazza.LeetCodeByJava;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-07
 * Time: 6:04 PM
 */
public class No84LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int res = 0, left = 0, right = heights.length - 1;
        while (left != right) {
            res = Math.max(res, (right - left) * Math.min(heights[left], heights[right]));
            if (heights[left] < heights[right]) ++left;
        }
    }
}
