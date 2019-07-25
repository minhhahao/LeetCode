#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-05
# https://leetcode.com/problems/search-a-2d-matrix/
from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == [] or matrix == [[]]:
            return False

        rowLen, colLen = len(matrix), len(matrix[0])
        l, r = 0, rowLen * colLen - 1

        while l < r:
            mid = l + (r - l) // 2
            row, col = mid // colLen, mid % colLen
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                r = mid - 1
            else:
                l = mid + 1

        return matrix[l // colLen][r % colLen] == target


if __name__ == '__main__':
    solution = Solution()

    matrix = [
        [1, 3, 5, 7],
        [10, 11, 16, 20],
        [23, 30, 34, 50]
    ]
    assert solution.searchMatrix(matrix, 3) is True

    matrix = [
        [1, 3, 5, 7],
        [10, 11, 16, 20],
        [23, 30, 34, 50]
    ]
    assert solution.searchMatrix(matrix, 13) is False

    assert solution.searchMatrix([], 0) is False