#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/1 19:30
# https://leetcode.com/problems/two-sum/
from typing import List


def twoSum(self, nums: List[int], target: int) -> List[int]:
    map = {}
    for i, num in enumerate(nums):
        if target - num in map:
            return [map[target - num], i]
        map[num] = i

    return []


if __name__ == '__main__':
    nums = [2, 7, 11, 15]
    print(twoSum(None, nums, 9))