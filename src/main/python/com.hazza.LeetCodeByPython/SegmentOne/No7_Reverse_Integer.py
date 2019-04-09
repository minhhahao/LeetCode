#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/7 21:06
# https://leetcode.com/problems/reverse-integer/


class Solution:
    def reverse(self, x: int) -> int:
        sign = [1, -1][x < 0]
        res, x = 0, abs(x)
        while x != 0:
            x, tail = divmod(x, 10)
            newRes = int(res * 10 + tail)
            res = newRes

        return sign * res if -pow(2, 31) <= sign * res <= pow(2, 31)-1 else 0


if __name__ == '__main__':
    solution = Solution()
    assert solution.reverse(123) == 321
    assert solution.reverse(120) == 21
    assert solution.reverse(-123) == -321
    assert solution.reverse(1534236469) == 0