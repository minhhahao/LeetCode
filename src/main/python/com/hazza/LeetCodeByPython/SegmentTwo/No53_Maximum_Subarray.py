#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/21 21:19
# https://leetcode.com/problems/maximum-subarray/
from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curMax, totalMax = nums[0], nums[0]

        for n in nums[1:]:
            curMax = max(curMax + n, n)
            totalMax = max(curMax, totalMax)

        return totalMax

if __name__ == '__main__':
    solution = Solution()

    assert solution.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]) == 6