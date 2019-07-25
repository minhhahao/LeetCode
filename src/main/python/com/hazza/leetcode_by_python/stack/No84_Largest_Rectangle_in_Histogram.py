#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-22
# https://leetcode.com/problems/largest-rectangle-in-histogram/
from typing import List


class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        res = 0
        stack = [-1]

        heights.append(0)
        for i in range(len(heights)):
            while heights[i] < heights[stack[-1]]:
                h = heights[stack.pop()]
                w = i - stack[-1] - 1
                res = max(res, w * h)
            stack.append(i)
        heights.pop()

        return res


if __name__ == '__main__':
    solution = Solution()

    assert solution.largestRectangleArea([2, 1, 5, 6, 2, 3]) == 10
