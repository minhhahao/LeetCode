#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/14 20:12
# https://leetcode.com/problems/wildcard-matching/


class Solution:
    # solution 1
    def isMatch1(self, s: str, p: str) -> bool:
        lenS, lenP = len(s), len(p)
        si, pi, start, match = 0, 0, -1, 0

        while si < lenS:
            if pi < lenP and (s[si] == p[pi] or p[pi] == '?'):
                si += 1
                pi += 1
            elif pi < lenP and p[pi] == '*':
                start = pi
                match = si
                pi += 1
            elif start != -1:
                pi = start + 1
                match += 1
                si = match
            else:
                return False

        return pi == lenP or p.count('*', pi) == lenP - pi

    # solution 2
    def isMatch2(self, s: str, p: str) -> bool:
        lenP = len(p)
        dp = [False] * (lenP + 1)

        dp[0] = True
        for i in range(1, lenP + 1):
            dp[i] = dp[i - 1] and p[i - 1] == '*'

        for c in s:
            prev = dp[0]
            for j in range(1, lenP + 1):
                temp = dp[j]
                if c == p[j - 1] or p[j - 1] == '?':
                    dp[j] = prev
                elif p[j - 1] == '*':
                    dp[j] = dp[j] or dp[j - 1]
                else:
                    dp[j] = False
                prev = temp
            dp[0] = False

        return dp[lenP]


if __name__ == '__main__':
    solution = Solution()

    assert solution.isMatch1('aa', 'a') is False
    assert solution.isMatch1('aa', '*') is True
    assert solution.isMatch1('cb', '?a') is False
    assert solution.isMatch1('adceb', '*a*b') is True
    assert solution.isMatch1('acdcb', 'a*c?b') is False


    assert solution.isMatch2('aa', 'a') is False
    assert solution.isMatch2('aa', '*') is True
    assert solution.isMatch2('cb', '?a') is False
    assert solution.isMatch2('adceb', '*a*b') is True
    assert solution.isMatch2('acdcb', 'a*c?b') is False
