#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/16 20:28
# https://leetcode.com/problems/plus-one/
from typing import List


class Solution:
    def plusOne1(self, digits: List[int]) -> List[int]:
        for i in range(len(digits))[::-1]:
            digits[i] += 1
            if digits[i] == 10:
                digits[i] = 0
            else:
                return digits

        return [1] + digits

    def plusOne2(self, digits: List[int]) -> List[int]:
        if len(digits) == 0:
            digits = [1]
        elif digits[-1] == 9:
            digits = self.plusOne2(digits[:-1])
            digits.extend([0])
        else:
            digits[-1] += 1

        return digits


if __name__ == '__main__':
    solution = Solution()

    assert solution.plusOne1([1, 2, 3]) == [1, 2, 4]
    assert solution.plusOne1([4, 3, 2, 1]) == [4, 3, 2, 2]
    assert solution.plusOne1([9]) == [1, 0]

    assert solution.plusOne2([1, 2, 3]) == [1, 2, 4]
    assert solution.plusOne2([4, 3, 2, 1]) == [4, 3, 2, 2]
    assert solution.plusOne2([9]) == [1, 0]
