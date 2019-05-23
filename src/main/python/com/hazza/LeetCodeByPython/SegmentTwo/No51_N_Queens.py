#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/22 19:54
# https://leetcode.com/problems/n-queens/
from typing import List


class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        res = []
        self.dfs(n, [], [], [], res)

        return [['.' * i + 'Q' + '.' * (n - i - 1)
                 for i in rows]for rows in res]

    def dfs(self, n, queens, xy_dif, xy_sum, res):
        y = len(queens)
        if y == n:
            res.append(queens)
            return

        for x in range(n):
            if x not in queens and (
                    x -
                    y) not in xy_dif and (
                    x +
                    y) not in xy_sum:
                self.dfs(n, queens + [x], xy_dif +
                         [x - y], xy_sum + [x + y], res)


if __name__ == '__main__':
    solution = Solution()

    expected = [
        [".Q..",
         "...Q",
         "Q...",
         "..Q."],
        ["..Q.",
         "Q...",
         "...Q",
         ".Q.."]
    ]
    res = solution.solveNQueens(4)
    assert sorted(res) == sorted(expected)
