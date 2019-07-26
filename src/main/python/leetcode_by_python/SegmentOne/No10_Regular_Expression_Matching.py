#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/8 21:06
# https://leetcode.com/problems/regular-expression-matching/


class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        lenS, lenP = len(s), len(p)
        dp = [[False] * (lenP + 1) for _ in range(lenS + 1)]

        dp[0][0] = True
        for i in range(1, lenP):
            dp[0][i + 1] = dp[0][i - 1] and p[i] == '*'

        for i in range(lenS):
            for j in range(lenP):
                if p[j] == s[i] or p[j] == '.':
                    dp[i + 1][j + 1] = dp[i][j]
                if p[j] == '*':
                    if p[j - 1] != s[i] and p[j - 1] != '.':
                        dp[i + 1][j + 1] = dp[i + 1][j - 1]
                    else:
                        dp[i + 1][j + 1] = dp[i][j + 1] or dp[i + 1][j] or dp[i + 1][j - 1]

        return dp[lenS][lenP]


if __name__ == '__main__':
    solution = Solution()
    assert solution.isMatch('aa', 'a') == False
    assert solution.isMatch('aa', 'a*') == True
    assert solution.isMatch('ab', '.*') == True
    assert solution.isMatch('aab', 'c*a*b') == True
    assert solution.isMatch('mississippi', 'mis*is*p*.') == False