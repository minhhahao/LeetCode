#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-04
# https://leetcode.com/problems/set-matrix-zeroes/
from typing import List


class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        rowLen, colLen = len(matrix), len(matrix[0])
        isFirstColZero = False

        for i in range(rowLen):
            if not matrix[i][0]:
                isFirstColZero = True
            for j in range(1, colLen):
                if not matrix[i][j]:
                    matrix[i][0] = matrix[0][j] = 0

        for i in range(0, rowLen)[::-1]:
            for j in range(1, colLen)[::-1]:
                if not matrix[i][0] or not matrix[0][j]:
                    matrix[i][j] = 0
            if isFirstColZero:
                matrix[i][0] = 0


if __name__ == '__main__':
    solution = Solution()

    input = [
        [1, 1, 1],
        [1, 0, 1],
        [1, 1, 1]
    ]
    output = [
        [1, 0, 1],
        [0, 0, 0],
        [1, 0, 1]
    ]
    solution.setZeroes(input)
    assert input == output

    input = [
        [0, 1, 2, 0],
        [3, 4, 5, 2],
        [1, 3, 1, 5]
    ]
    output = [
        [0, 0, 0, 0],
        [0, 4, 5, 0],
        [0, 3, 1, 0]
    ]
    solution.setZeroes(input)
    assert input == output
