#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/23 20:40
# https://leetcode.com/problems/n-queens-ii/


class Solution:
    def totalNQueens(self, n: int) -> int:
        return self.dfs(n, [], [], [])

    def dfs(self, n, queens, xy_dif, xy_sum):
        cnt, y = 0, len(queens)
        if n == y:
            return 1

        for x in range(n):
            if x not in queens and (
                    x - y) not in xy_dif and (
                    x + y) not in xy_sum:
                cnt += self.dfs(n,
                                queens + [x],
                                xy_dif + [x - y],
                                xy_sum + [x + y])

        return cnt


if __name__ == '__main__':
    solution = Solution()

    assert solution.totalNQueens(4) == 2