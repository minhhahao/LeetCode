#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-11
# https://leetcode.com/problems/subsets/
from typing import List


class Solution:
    def subsets1(self, nums: List[int]) -> List[List[int]]:
        def dfs(idx, path, res):
            res.append(path)
            for i in range(idx, len(nums)):
                dfs(i + 1, path + [nums[i]], res)

        res = []
        nums.sort()
        dfs(0, [], res)

        return res

    def subsets2(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        for i in sorted(nums):
            res += [s + [i] for s in res]

        return res

    def subsets3(self, nums: List[int]) -> List[List[int]]:
        numsLen = len(nums)
        subsetsLen = 1 << numsLen
        res = []
        nums.sort()

        for i in range(subsetsLen):
            temp = []
            for j in range(numsLen):
                if (i >> j) & 1:
                    temp.append(nums[j])
            res.append(temp)

        return res


if __name__ == '__main__':
    solution = Solution()

    input = [1, 2, 3]
    expected = sorted([
        [3],
        [1],
        [2],
        [1, 2, 3],
        [1, 3],
        [2, 3],
        [1, 2],
        []
    ])

    assert sorted(solution.subsets1(input)) == expected
    assert sorted(solution.subsets2(input)) == expected
    assert sorted(solution.subsets3(input)) == expected
