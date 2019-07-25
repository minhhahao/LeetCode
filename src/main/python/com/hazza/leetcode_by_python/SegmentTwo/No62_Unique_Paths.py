#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/12 20:53
# https://leetcode.com/problems/unique-paths/


class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        dp = [0] * (n + 1)
        dp[1] = 1

        for _ in range(0, m):
            for i in range(1, n + 1):
                dp[i] = dp[i] + dp[i - 1]

        return dp[n]


if __name__ == '__main__':
    solution = Solution()

    assert solution.uniquePaths(3, 2) == 3
    assert solution.uniquePaths(7, 3) == 28
