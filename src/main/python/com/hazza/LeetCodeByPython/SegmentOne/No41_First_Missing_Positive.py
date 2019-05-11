#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/11 20:55
# https://leetcode.com/problems/first-missing-positive/
from typing import List


class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        numsLen = len(nums)

        i = 0
        while i < numsLen:
            n = nums[i]
            if 0 < n <= numsLen and n - 1 != i and n != nums[n - 1]:
                nums[i], nums[n - 1] = nums[n - 1], n
            else:
                i += 1

        for i, n in enumerate(nums):
            if i != n - 1:
                return i + 1

        return numsLen + 1


if __name__ == '__main__':
    solution = Solution()
    print(solution.firstMissingPositive([3, 4, -1, 1]))
    assert solution.firstMissingPositive([1, 2, 0]) == 3
    assert solution.firstMissingPositive([3, 4, -1, 1]) == 2
    assert solution.firstMissingPositive([7, 8, 9, 11, 12]) == 1
    assert solution.firstMissingPositive([1, 2, 1]) == 3
