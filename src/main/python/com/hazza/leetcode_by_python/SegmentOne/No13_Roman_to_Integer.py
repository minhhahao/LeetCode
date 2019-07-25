#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/11 20:49
# https://leetcode.com/problems/roman-to-integer/


class Solution:
    def romanToInt(self, s: str) -> int:
        integers = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        roman = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        romans = {'M': 1000, 'D': 500, 'C': 100, 'L': 50, 'X': 10, 'V': 5, 'I': 1}
        res = 0

        for i in range(0, len(s) - 1):
            if romans[s[i]] < romans[s[i + 1]]:
                res -= romans[s[i]]
            else:
                res += romans[s[i]]

        return res + romans[s[-1]]


if __name__ == '__main__':
    solution = Solution()
    assert solution.romanToInt('III') == 3
    assert solution.romanToInt('IV') == 4
    assert solution.romanToInt('IX') == 9
    assert solution.romanToInt('LVIII') == 58