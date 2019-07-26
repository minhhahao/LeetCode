#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/10 20:50
# https://leetcode.com/problems/combination-sum-ii/
from typing import List


class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()
        self.dfs(candidates, target, 0, [], res)

        return res

    def dfs(self, candidates, target, idx, path, res):
        if target < 0:
            return
        if target == 0:
            res.append(path)
            return
        for i in range(idx, len(candidates)):
            if i > idx and candidates[i] == candidates[i - 1]:
                continue
            if candidates[i] > target:
                break
            self.dfs(candidates, target - candidates[i], i + 1, path + [candidates[i]], res)


if __name__ == '__main__':
    solution = Solution()

    assert sorted(solution.combinationSum2([10, 1, 2, 7, 6, 1, 5], 8)) == sorted([[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]])
    assert sorted(solution.combinationSum2([2, 5, 2, 1, 2], 5)) == sorted([[1, 2, 2], [5]])