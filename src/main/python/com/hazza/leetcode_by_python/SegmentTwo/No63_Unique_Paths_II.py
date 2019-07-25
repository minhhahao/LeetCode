#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/13 20:09
# https://leetcode.com/problems/unique-paths-ii/
from typing import List


class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        m, n = len(obstacleGrid), len(obstacleGrid[0])
        dp = [0] * (n + 1)

        dp[1] = 1
        for i in range(m):
            for j in range(n):
                if obstacleGrid[i][j] == 1:
                    dp[j + 1] = 0
                else:
                    dp[j + 1] = dp[j + 1] + dp[j]

        return dp[n]


if __name__ == '__main__':
    solution = Solution()

    input = [
        [0, 0, 0],
        [0, 1, 0],
        [0, 0, 0]
    ]
    assert solution.uniquePathsWithObstacles(input) == 2
