#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/12 20:16
# https://leetcode.com/problems/trapping-rain-water/
from typing import List


class Solution:
    def trap1(self, height: List[int]) -> int:
        if len(height) < 2:
            return 0
        l, r = 0, len(height) - 1
        lMax = rMax = 0
        res = 0

        while l <= r:
            if height[l] <= height[r]:
                if height[l] >= lMax:
                    lMax = height[l]
                else:
                    res += lMax - height[l]
                l += 1
            else:
                if height[r] >= rMax:
                    rMax = height[r]
                else:
                    res += rMax - height[r]
                r -= 1

        return res

    def trap2(self, height: List[int]) -> int:
        stack = []
        heightLen = len(height)
        res = 0

        i = 0
        while i < heightLen:
            if len(stack) == 0 or height[stack[-1]] >= height[i]:
                stack.append(i)
                i += 1
            else:
                bottom = height[stack.pop()]
                bottomWater = 0 if len(stack) == 0 else (min(height[i], height[stack[-1]]) - bottom) * (i - stack[-1] - 1)
                res += bottomWater

        return res


if __name__ == '__main__':
    solution = Solution()

    assert solution.trap1([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]) == 6
    assert solution.trap2([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]) == 6