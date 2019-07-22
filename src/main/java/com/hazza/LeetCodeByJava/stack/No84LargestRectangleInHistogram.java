package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.SegmentTree;
import org.omg.CORBA.MARSHAL;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-07
 * Time: 6:04 PM
 */
public class No84LargestRectangleInHistogram {

    // solution 1
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        int[] st = SegmentTree.constructST(heights);
        return getAreaRec(heights, st, 0, heights.length - 1);
    }

    private int getAreaRec(int[] heights, int[] st, int left, int right) {
        if (left > right) return Integer.MIN_VALUE;
        if (left == right) return heights[left];
        int m = SegmentTree.RMQ(heights, st, left, right);
        return Math.max(Math.max(getAreaRec(heights, st, left, m - 1),
                getAreaRec(heights, st, m + 1, right)),
                (right - left + 1) * heights[m]);
    }

    // solution 2
    public int largestRectangleArea1(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0, n = heights.length;

        for (int i = 0; i <= n ; i++) {
            int top = (i == n ? 0 : heights[i]);
            if (stack.isEmpty() || heights[stack.peek()] <= top) stack.push(i);
            else {
                top = stack.pop();
                maxArea = Math.max(maxArea,
                        heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
                --i;
            }
        }

        return maxArea;
    }
}
