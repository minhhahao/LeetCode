#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-23
# https://leetcode.com/problems/maximal-rectangle/
from typing import List


class Solution:
    # dp
    def maximalRectangle1(self, matrix: List[List[str]]) -> int:
        if not matrix:
            return 0
        n = len(matrix[0])
        heights, left, right = [0] * (n + 1), [0] * (n + 1), [n] * (n + 1)
        res = 0

        for row in matrix:
            curLeft, curRight = 0, n
            for i in range(n):
                if row[i] == '1':
                    heights[i] += 1
                    left[i] = max(left[i], curLeft)
                else:
                    heights[i] = 0
                    curLeft = i + 1
                    left[i] = 0
            for i in range(n)[::-1]:
                if row[i] == '1':
                    right[i] = min(right[i], curRight)
                else:
                    curRight = i
                    right[i] = n
            for i in range(n):
                res = max(res, (right[i] - left[i]) * heights[i])

        return res

    # stack
    def maximalRectangle2(self, matrix: List[List[str]]) -> int:
        if not matrix:
            return 0
        n = len(matrix[0])
        heights = [0] * (n + 1)
        res = 0

        for row in matrix:
            stack = [-1]
            for i in range(n + 1):
                if i < n:
                    heights[i] = heights[i] + 1 if row[i] == '1' else 0
                while heights[i] < heights[stack[-1]]:
                    h = heights[stack.pop()]
                    w = i - stack[-1] - 1
                    res = max(res, h * w)
                stack.append(i)

        return res


if __name__ == '__main__':
    solution = Solution()

    matrix = [
        ["1", "0", "1", "0", "0"],
        ["1", "0", "1", "1", "1"],
        ["1", "1", "1", "1", "1"],
        ["1", "0", "0", "1", "0"]
    ]
    assert solution.maximalRectangle1(matrix) == 6
    assert solution.maximalRectangle2(matrix) == 6
