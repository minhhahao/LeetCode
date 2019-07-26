#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/7 21:35
# https://leetcode.com/problems/insert-interval/
from typing import List


class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        s, e = newInterval[0], newInterval[1]

        l = [interval for interval in intervals if interval[1] < s]
        r = [interval for interval in intervals if interval[0] > e]
        if l + r != intervals:
            s = min(s, intervals[len(l)][0])
            e = max(e, intervals[~len(r)][1])

        return l + [[s, e]] + r


if __name__ == '__main__':
    solution = Solution()

    intervals = [[1, 3], [6, 9]]
    newInterval = [2, 5]
    expected = [[1, 5], [6, 9]]
    assert sorted(solution.insert(intervals, newInterval)) == sorted(expected)

    intervals = [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]]
    newInterval = [4, 8]
    expected = [[1, 2], [3, 10], [12, 16]]
    assert sorted(solution.insert(intervals, newInterval)) == sorted(expected)
