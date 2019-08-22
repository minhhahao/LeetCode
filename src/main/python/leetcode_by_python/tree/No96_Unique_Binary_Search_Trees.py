#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-22
# https://leetcode.com/problems/unique-binary-search-trees/


class Solution:
    def numTrees(self, n: int) -> int:
        dp = [0] * (n + 1)

        dp[0] = dp[1] = 1
        for i in range(2, n + 1):
            for j in range(1, i + 1):
                dp[i] += dp[j - 1] * dp[i - j]

        return dp[n]

