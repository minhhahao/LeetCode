#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-02


class Solution:
    def numDistinct(self, s: str, t: str) -> int:
        s_len, t_len = len(s), len(t)
        dp = [1] * (s_len + 1)
        prev = 1
        dp[0] = 0

        for i in range(1, t_len + 1):
            for j in range(1, s_len + 1):
                tmp = dp[j]
                if s[j - 1] == t[i - 1]:
                    dp[j] = dp[j - 1] + prev
                else:
                    dp[j] = dp[j - 1]
                prev = tmp
            prev = 0

        return dp[s_len]

