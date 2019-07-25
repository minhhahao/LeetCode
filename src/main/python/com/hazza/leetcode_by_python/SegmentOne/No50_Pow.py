#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/20 20:07
# https://leetcode.com/problems/powx-n/


class Solution:
    def myPow(self, x: float, n: int) -> float:
        res = 1;
        if n < 0:
            x = 1 / x
            n = -n
        while n:
            if n & 1:
                res *= x
            x *= x
            n >>= 1

        return res


if __name__ == '__main__':
    solution = Solution()

    assert round(solution.myPow(2.00000, 10), 5) == 1024.00000
    assert round(solution.myPow(2.10000, 3), 5) == 9.26100
    assert round(solution.myPow(2.00000, -2), 5) == 0.25000