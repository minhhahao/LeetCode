#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-09
# https://leetcode.com/problems/combinations/
from typing import List


class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        if k == 0:
            return [[]]

        return [pre + [i] for i in range(k, n + 1) for pre in self.combine(i - 1, k - 1)]


if __name__ == '__main__':
    solution = Solution()

    assert sorted(solution.combine(4, 2)) == sorted([
        [2, 4],
        [3, 4],
        [2, 3],
        [1, 2],
        [1, 3],
        [1, 4],
    ])
