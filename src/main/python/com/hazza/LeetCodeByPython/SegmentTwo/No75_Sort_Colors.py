#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-07
# https://leetcode.com/problems/sort-colors/
from typing import List


class Solution:
    def sortColors1(self, nums: List[int]) -> None:
        n0, n1 = 0, 0

        for n2, n in enumerate(nums[:]):
            nums[n2] = 2
            if n < 2:
                nums[n1] = 1
                n1 += 1
            if n == 0:
                nums[n0] = 0
                n0 += 1

    def sortColors2(self, nums: List[int]) -> None:
        n0, i, n2 = 0, 0, len(nums) - 1

        while i <= n2:
            if nums[i] == 0 and i != n0:
                nums[i], nums[n0] = nums[n0], nums[i]
                n0 += 1
            elif nums[i] == 2 and i != n2:
                nums[i], nums[n2] = nums[n2], nums[i]
                n2 -= 1
            else:
                i += 1


if __name__ == '__main__':
    solution = Solution()

    nums = [2, 0, 2, 1, 1, 0]
    solution.sortColors1(nums)
    assert nums == [0, 0, 1, 1, 2, 2]

    nums = [2, 0, 2, 1, 1, 0]
    solution.sortColors2(nums)
    assert nums == [0, 0, 1, 1, 2, 2]