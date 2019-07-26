#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/4 20:24
# https://leetcode.com/problems/combination-sum/
from typing import List


class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        self.dfs(candidates, target, 0, [], res)

        return res

    def dfs(self, candidates, target, idx, path, res):
        if target < 0:
            return
        if target == 0:
            res.append(path)
            return
        for i in range(idx, len(candidates)):
            self.dfs(candidates, target - candidates[i], i, path + [candidates[i]], res)


if __name__ == '__main__':
    solution = Solution()
    print(solution.combinationSum([2, 3, 6, 7], 7))
    assert sorted(solution.combinationSum([2, 3, 6, 7], 7)) == sorted([[7], [2, 2, 3]])
    assert sorted(solution.combinationSum([2, 3, 5], 8)) == sorted([[2, 2, 2, 2], [2, 3, 3], [3, 5]])