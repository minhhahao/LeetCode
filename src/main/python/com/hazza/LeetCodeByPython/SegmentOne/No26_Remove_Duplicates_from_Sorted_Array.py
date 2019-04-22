#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/22 20:22
# https://leetcode.com/problems/remove-duplicates-from-sorted-array/
from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0

        cnt = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[cnt] = nums[i]
                cnt += 1
            i += 1

        return cnt


if __name__ == '__main__':
    solution = Solution()
    assert solution.removeDuplicates([1, 1, 2]) == 2
    assert solution.removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]) == 5