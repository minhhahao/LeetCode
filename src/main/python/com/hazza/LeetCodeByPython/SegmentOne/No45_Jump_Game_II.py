#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/16 20:31
# https://leetcode.com/problems/jump-game-ii/
from typing import List


class Solution:
    def jump(self, nums: List[int]) -> int:
        steps, cur, curMax = 0, 0, 0
        numsLen = len(nums)

        for i, n in enumerate(nums[:-1]):
            curMax = max(curMax, i + n)
            if i == cur:
                steps += 1
                cur = curMax
                if cur >= numsLen:
                    break

        return steps


if __name__ == '__main__':
    solution = Solution()

    print(solution.jump([2, 3, 1, 1, 4]))

    assert solution.jump([2, 3, 1, 1, 4]) == 2