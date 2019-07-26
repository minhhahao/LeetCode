#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/9 20:06
# https://leetcode.com/problems/spiral-matrix-ii/
from typing import List


class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        res = [[0] * n for _ in range(n)]
        i, j, di, dj = 0, 0, 0, 1

        for k in range(1, n*n+1):
            res[i][j] = k
            if res[(i+di)%n][(j+dj)%n]:
                di, dj = dj, -di
            i += di
            j += dj

        return res


if __name__ == '__main__':
    solution = Solution()

    expected = [
        [1, 2, 3],
        [8, 9, 4],
        [7, 6, 5]
    ]
    assert solution.generateMatrix(3) == expected
