#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-30
# https://leetcode.com/problems/subsets-ii/
from typing import List


class Solution:
    # backtracking
    def subsetsWithDup1(self, nums: List[int]) -> List[List[int]]:
        def dfs(start, path):
            res.append(path)

            for i in range(start, n):
                if i == start or nums[i] != nums[i - 1]:
                    dfs(i + 1, path + [nums[i]])

        nums.sort()
        res = []
        n = len(nums)
        dfs(0, [])

        return res

    # iterative
    def subsetsWithDup2(self, nums: List[int]) -> List[List[int]]:
        res = [[]]

        nums.sort()
        for i in range(len(nums)):
            if i == 0 or nums[i] != nums[i - 1]:
                l = len(res)
            for j in range(len(res) - l, len(res)):
                res.append(res[j] + [nums[i]])

        return res

