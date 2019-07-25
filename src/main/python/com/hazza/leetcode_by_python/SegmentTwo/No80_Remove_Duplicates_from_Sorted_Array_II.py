#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-15
# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        cnt = 0

        for n in nums:
            if cnt < 2 or n > nums[cnt - 2]:
                nums[cnt] = n
                cnt += 1

        return cnt


if __name__ == '__main__':
    solution = Solution()

    assert solution.removeDuplicates([1, 1, 1, 2, 2, 3]) == 5
    assert solution.removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3]) == 7
