#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/22 21:27
# https://leetcode.com/problems/climbing-stairs/


class Solution:
    def climbStairs(self, n: int) -> int:
        a = b = 1

        for _ in range(n):
            a, b = b, a + b

        return a


if __name__ == '__main__':
    solution = Solution()

    assert solution.climbStairs(2) == 2
    assert solution.climbStairs(3) == 3