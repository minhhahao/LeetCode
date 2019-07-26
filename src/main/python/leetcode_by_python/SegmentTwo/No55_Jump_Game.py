#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/27 20:16
# https://leetcode.com/problems/jump-game/
from typing import List


class Solution:
    def canJump(self, nums: List[int]) -> bool:
        curMax, numsLen = 0, len(nums)

        for i, n in enumerate(nums):
            if i > curMax:
                return False
            curMax = max(curMax, i + n)

        return True


if __name__ == '__main__':
    solution = Solution()
    assert solution.canJump([2, 3, 1, 1, 4]) == True
    assert solution.canJump([3, 2, 1, 0, 4]) == False
