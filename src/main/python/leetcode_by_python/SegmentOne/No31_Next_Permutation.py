#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/26 20:46
# https://leetcode.com/problems/next-permutation/
from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        if not nums or len(nums) < 2:
            return

        numsLen = len(nums)
        i = numsLen - 1
        while i > 0:
            if nums[i] > nums[i - 1]:
                break
            i -= 1
        if i > 0:
            for j in range(i - 1, numsLen)[::-1]:
                if nums[j] > nums[i - 1]:
                    nums[j], nums[i - 1] = nums[i - 1], nums[j]
                    break

        nums[i:] = sorted(nums[i:])


if __name__ == '__main__':
    solution = Solution()

    nums = [1, 2, 3]
    solution.nextPermutation(nums)
    assert nums == [1, 3, 2]

    nums = [3, 2, 1]
    solution.nextPermutation(nums)
    assert nums == [1, 2, 3]

    nums = [1, 1, 5]
    solution.nextPermutation(nums)
    assert nums == [1, 5, 1]

    nums = [1, 3, 2]
    solution.nextPermutation(nums)
    assert nums == [2, 1, 3]