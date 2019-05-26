#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/25 20:26
# https://leetcode.com/problems/spiral-matrix/
from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        return matrix and list(matrix.pop(0)) + self.spiralOrder(list(zip(*matrix))[::-1])


if __name__ == '__main__':
    solution = Solution()

    input = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    assert solution.spiralOrder(input) == [1, 2, 3, 6, 9, 8, 7, 4, 5]

    input = [
        [1, 2, 3, 4],
        [5, 6, 7, 8],
        [9, 10, 11, 12]
    ]
    assert solution.spiralOrder(input) == [
        1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
