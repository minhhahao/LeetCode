#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-25
# https://leetcode.com/problems/scramble-string/


class Solution:
    # dfs
    def isScramble1(self, s1: str, s2: str) -> bool:
        l1, l2 = len(s1), len(s2)
        if l1 != l2 or sorted(s1) != sorted(s2):
            return False
        if l1 < 4 or s1 == s2:
            # trick: l1 < 4, because all 3 letters are scramble
            return True

        for i in range(1, l1):
            if self.isScramble1(s1[:i], s2[:i]) and self.isScramble1(s1[i:], s2[i:]) \
                    or self.isScramble1(s1[:i], s2[-i:]) and self.isScramble1(s1[i:], s2[:-i]):
                return True

        return False

    # dp
    def isScramble2(self, s1: str, s2: str) -> bool:
        n = len(s1)
        dp = [[[False] * (n + 1) for _ in range(n)] for _ in range(n)]

        for k in range(1, n + 1):
            for i in range(0, n - k + 1):
                for j in range(0, n - k + 1):
                    if k == 1:
                        dp[i][j][k] = s1[i] == s2[j]
                    else:
                        for q in range(1, k):
                            if not dp[i][j][k]:
                                dp[i][j][k] = dp[i][j][q] and dp[i + q][j + q][k - q] \
                                              or dp[i][j + k - q][q] and dp[i + q][j][k - q]

        return dp[0][0][n]


if __name__ == '__main__':
    solution = Solution()

    assert solution.isScramble1('great', 'rgeat') is True
    assert solution.isScramble1('abcde', 'caebd') is False
    assert solution.isScramble1('abb', 'bba') is True

    assert solution.isScramble2('great', 'rgeat') is True
    assert solution.isScramble2('abcde', 'caebd') is False
    assert solution.isScramble2('abb', 'bba') is True
