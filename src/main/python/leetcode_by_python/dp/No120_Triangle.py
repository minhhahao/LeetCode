#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-06
import sys
from typing import List


class Solution:
    # solution 1
    def minimumTotal1(self, triangle: List[List[int]]) -> int:
        n_rows = len(triangle)
        dp = [sys.maxsize] * (n_rows + 1)

        dp[1] = triangle[0][0]
        for i in range(1, n_rows):
            prev = dp[0]
            for j in range(1, i + 2):
                temp = dp[j]
                cur = triangle[i][j - 1]
                dp[j] = min(prev, dp[j]) + triangle[i][j - 1]
                prev = temp

        return min(dp[1:])

    # solution 2
    def minimumTotal2(self, triangle: List[List[int]]) -> int:
        n_rows = len(triangle)
        dp = [0] * (n_rows + 1)

        for i in reversed(range(n_rows)):
            for j in range(i + 1):
                dp[j] = min(dp[j], dp[j + 1]) + triangle[i][j]

        return dp[0]

