#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/6 19:54
# https://leetcode.com/problems/merge-intervals/
from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals) == 0:
            return []

        intervals.sort(key=lambda x: x[0])
        res = [intervals[0]]

        for interval in intervals[1:]:
            if interval[0] <= res[-1][1]:
                res[-1][1] = max(res[-1][1], interval[1])
            else:
                res.append(interval)

        return res


if __name__ == '__main__':
    solution = Solution()

    input = [[1, 3], [2, 6], [8, 10], [15, 18]]
    expected = [[1, 6], [8, 10], [15, 18]]
    assert sorted(solution.merge(input)) == sorted(expected)

    input = [[1, 4], [4, 5]]
    expected = [[1, 5]]
    assert sorted(solution.merge(input)) == sorted(expected)
