#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/22 20:52
# https://leetcode.com/problems/remove-element/
from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        if not nums or len(nums) == 0:
            return 0

        cnt = 0
        for i in range(0, len(nums)):
            if nums[i] != val:
                nums[cnt] = nums[i]
                cnt += 1

        return cnt


if __name__ == '__main__':
    pass