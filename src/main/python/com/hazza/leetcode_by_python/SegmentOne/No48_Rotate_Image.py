#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/18 21:49
# https://leetcode.com/problems/rotate-image/
from typing import List


class Solution:
    # solution 1
    def rotate1(self,  matrix: List[List[int]]) -> None:
        n = len(matrix)

        for i in range(n):
            for j in range(i):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        for row in matrix:
            for i in range(n // 2):
                row[i], row[~i] = row[~i], row[i]

    # solution 2
    def rotate2(self,  matrix: List[List[int]]) -> None:
        matrix[:] = map(list, zip(*matrix[::-1]))


if __name__ == '__main__':
    solution = Solution()

    matrix1 = [[1, 2, 3], 
               [4, 5, 6], 
               [7, 8, 9]]
    expected1 = [[7, 4, 1], 
                 [8, 5, 2], 
                 [9, 6, 3]]
    solution.rotate1(matrix1)
    assert matrix1 == expected1

    matrix2 = [[5, 1, 9, 11],
               [2, 4, 8, 10],
               [13, 3, 6, 7],
               [15, 14, 12, 16]]
    expected2 = [[15, 13, 2, 5],
                 [14, 3, 4, 1],
                 [12, 6, 8, 9],
                 [16, 7, 10, 11]]
    solution.rotate1(matrix2)
    assert matrix2 == expected2

    matrix1 = [[1, 2, 3],
               [4, 5, 6],
               [7, 8, 9]]
    expected1 = [[7, 4, 1],
                 [8, 5, 2],
                 [9, 6, 3]]
    solution.rotate2(matrix1)
    assert matrix1 == expected1
    matrix2 = [[5, 1, 9, 11],
               [2, 4, 8, 10],
               [13, 3, 6, 7],
               [15, 14, 12, 16]]
    expected2 = [[15, 13, 2, 5],
                 [14, 3, 4, 1],
                 [12, 6, 8, 9],
                 [16, 7, 10, 11]]
    solution.rotate2(matrix2)
    assert matrix2 == expected2
