#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/24 12:55
# https://leetcode.com/problems/divide-two-integers/


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        isNeg = (dividend < 0) ^ (divisor < 0)
        dividend, divisor = abs(dividend), abs(divisor)
        res = 0

        while dividend >= divisor:
            temp, i = divisor, 1
            while dividend >= temp:
                dividend -= temp
                res += i
                temp <<= 1
                i <<= 1

        if isNeg:
            res = -res
        return min(max(-2147483648, res), 2147483647)


if __name__ == '__main__':
    solution = Solution()
    assert solution.divide(10, 3) == 3
    assert solution.divide(7, -3) == -2