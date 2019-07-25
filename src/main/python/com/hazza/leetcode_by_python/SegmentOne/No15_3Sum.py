#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/12 20:40
# https://leetcode.com/problems/3sum/
from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        numsLen = len(nums)
        nums.sort()
        for i in range(numsLen - 2):
            if i == 0 or nums[i] != nums[i - 1]:
                left, right = i + 1, numsLen - 1
                while left < right:
                    if nums[i] + nums[left] + nums[right] == 0:
                        res.append([nums[i], nums[left], nums[right]])
                        while left < right and nums[left] == nums[left + 1]:
                            left += 1
                        left += 1
                        while left < right and nums[right] == nums[right - 1]:
                            right -= 1
                        right -= 1
                    elif nums[i] + nums[left] + nums[right] < 0:
                        left += 1
                    else:
                        right -= 1

        return res


if __name__ == '__main__':
    solution = Solution()
    assert solution.threeSum([-1, 0, 1, 2, -1, -4]) == [[-1, -1, 2], [-1, 0, 1]]
