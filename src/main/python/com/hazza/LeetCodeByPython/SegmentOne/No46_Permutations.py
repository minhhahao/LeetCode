#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/15 21:40
# https://leetcode.com/problems/permutations/
from typing import List


class Solution:
    def permute(self,  nums: List[int]) -> List[List[int]]:
        res = []
        self.dfs(nums, [], res)
        return res

    def dfs(self, nums, path, res):
        if len(nums) == len(path):
            res.append(path)
            return

        for n in nums:
            if n not in path:
                self.dfs(nums, path + [n], res)


if __name__ == '__main__':
    solution = Solution()

    print(sorted(solution.permute([1, 2, 3])))

    assert sorted(solution.permute([1, 2, 3])) == sorted([[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]])