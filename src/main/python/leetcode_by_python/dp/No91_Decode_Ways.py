#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-31
# https://leetcode.com/problems/decode-ways/


class Solution:
    def numDecodings(self, s: str) -> int:
        n = len(s)
        dp = [0] * (n + 1)
        dp[n] = 1
        dp[n - 1] = 0 if s[-1] == "0" else 1

        for i in reversed(range(0, n - 1)):
            if s[i] != "0":
                dp[i] = dp[i + 1] + dp[i + 2] \
                    if 1 <= int(s[i:i + 2]) <= 26 else dp[i + 1]

        return dp[0]
