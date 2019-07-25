#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-03
# https://leetcode.com/problems/edit-distance/


class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        m, n = len(word1), len(word2)
        dp = list(range(0, n+1))

        for i in range(1, m+1):
            prev = dp[0]
            for j in range(1, n+1):
                temp = dp[j]
                if word1[i-1] == word2[j-1]:
                    dp[j] = prev
                else:
                    insert = prev
                    delete = dp[j]
                    replace = dp[j-1]
                    dp[j] = min(insert, delete, replace) + 1
                prev = temp
            dp[0] = i

        return dp[n]


if __name__ == '__main__':
    solution = Solution()
    print(solution.minDistance('horse', 'ros'))
    assert solution.minDistance('horse', 'ros') == 3
    assert solution.minDistance('intention', 'execution') == 5
