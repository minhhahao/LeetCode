#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/17 21:53
# https://leetcode.com/problems/permutations-ii/
from collections import Counter
from typing import List


class Solution:
    def permuteUnique(self,  nums: List[int]) -> List[List[int]]:
        counter = Counter(nums)
        res = []
        self.dfs(nums, counter, [], res)

        return res

    def dfs(self, nums, counter, path, res):
        if len(path) == len(nums):
            res.append(path)
            return
        for i in counter:
            if counter[i] > 0:
                counter[i] -= 1
                path.append(i)
                self.dfs(nums, counter, path, res)
                path.pop()
                counter[i] += 1


if __name__ == '__main__':
    solution = Solution()
    sorted(solution.permuteUnique([1, 1, 2])) == sorted([[1, 1, 2], [1, 2, 1], [2, 1, 1]])