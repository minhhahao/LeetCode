#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/15 20:40
# https://leetcode.com/problems/4sum/
from typing import List


class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        def findNSum(left, right, target, N, prev, res):
            if N < 2 or right - left + 1 < N or target < nums[left] * N or target > nums[right] * N:
                return
            if N == 2:
                while left < right:
                    sum = nums[left] + nums[right]
                    if sum < target:
                        left += 1
                    elif sum > target:
                        right -= 1
                    else:
                        res.append(prev + [nums[left], nums[right]])
                        while left < right and nums[left] == nums[left + 1]:
                            left += 1
                        left += 1
                        while left < right and nums[right] == nums[right - 1]:
                            right -= 1
                        right -= 1
            else:
                for i in range(left, right + 1):
                    if i == left or nums[i] != nums[i - 1]:
                        findNSum(i + 1, right, target - nums[i], N - 1, prev + [nums[i]], res)

        res = []
        nums.sort()
        findNSum(0, len(nums) - 1, target, 4, [], res)

        return res


if __name__ == '__main__':
    solution = Solution()
    assert sorted(solution.fourSum([1, 0, -1, 0, -2, 2], 0)) == sorted([[-1,  0, 0, 1], [-2, -1, 1, 2], [-2,  0, 0, 2]])