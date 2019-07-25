#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/13 20:39
# https://leetcode.com/problems/3sum-closest/
from typing import List


class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        numsLen = len(nums)
        nums.sort()
        ans = nums[0] + nums[1] + nums[2]

        for i in range(numsLen - 2):
            left, right = i + 1, numsLen - 1
            while left < right:
                add = nums[i] + nums[left] + nums[right]
                if target == add:
                    return target
                elif target > add:
                    left += 1
                else:
                    right -= 1
                if abs(ans - target) > abs(add - target):
                        ans = add

        return ans


if __name__ == '__main__':
    solution = Solution()
    assert solution.threeSumClosest([-1, 2, 1, -4], 1) == 2
