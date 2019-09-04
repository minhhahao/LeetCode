#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-23
# https://leetcode.com/problems/interleaving-string/


class Solution:
    def isInterleave(self, s1: str, s2: str, s3: str) -> bool:
        len1, len2 = len(s1), len(s2)
        if len1 + len2 != len(s3):
            return False
        dp = [[False] * (len2 + 1) for _ in range(len1 + 1)]

        for i in range(0, len1 + 1):
            for j in range(0, len2 + 1):
                if i == 0 and j == 0:
                    dp[0][0] = True
                elif i == 0:
                    dp[i][j] = dp[i][j - 1] and s2[j - 1] == s3[i + j - 1]
                elif j == 0:
                    dp[i][j] = dp[i - 1][j] and s1[i - 1] == s3[i + j - 1]
                else:
                    dp[i][j] = (dp[i][j - 1] and s2[j - 1] == s3[i + j - 1]) or\
                               (dp[i - 1][j] and s1[i - 1] == s3[i + j - 1])
        return dp[len1][len2]
