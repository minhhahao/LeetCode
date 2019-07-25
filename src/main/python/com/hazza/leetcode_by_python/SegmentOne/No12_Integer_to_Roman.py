#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/10 19:05
# https://leetcode.com/problems/integer-to-roman/


class Solution:
    def intToRoman(self, num: int) -> str:
        integers = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        romans = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        res = []

        for i, delta in enumerate(integers):
            while num >= delta:
                num -= delta
                res.append(romans[i])
            if num == 0:
                break

        return ''.join(res)


if __name__ == '__main__':
    solution = Solution()
    assert solution.intToRoman(3) == 'III'
    assert solution.intToRoman(4) == 'IV'
    assert solution.intToRoman(58) == 'LVIII'
    assert solution.intToRoman(1994) == 'MCMXCIV'