#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/21 20:27
# https://leetcode.com/problems/sqrtx/


class Solution:
    def mySqrt1(self, x: int) -> int:
        l, r = 1, x

        while l <= r:
            m = l + (r - l) // 2
            product = m * m
            if product == x:
                return m
            elif product > x:
                r = m - 1
            else:
                l = m + 1

        return r

    def mySqrt2(self, x: int) -> int:
        r = x

        while abs(r * r - x) > 0.0001:
            r = (r + x / r) / 2

        return int(r)


if __name__ == '__main__':
    solution = Solution()

    assert solution.mySqrt1(4) == 2
    assert solution.mySqrt1(8) == 2

    assert solution.mySqrt2(4) == 2
    assert solution.mySqrt2(8) == 2
