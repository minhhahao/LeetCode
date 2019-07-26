#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/14 19:58
# https://leetcode.com/problems/minimum-path-sum/
import sys
from typing import List


class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m, n = len(grid), len(grid[0])
        dp = [sys.maxsize] * (n + 1)

        dp[1] = 0
        for i in range(m):
            for j in range(n):
               dp[j + 1] = min(dp[j + 1], dp[j]) + grid[i][j]

        return dp[n]


if __name__ == '__main__':
    solution = Solution()

    input = [
        [1, 3, 1],
        [1, 5, 1],
        [4, 2, 1]
    ]
    print(solution.minPathSum(input))
    assert solution.minPathSum(input) == 7
