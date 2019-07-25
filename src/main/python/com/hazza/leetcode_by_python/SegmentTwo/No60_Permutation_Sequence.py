#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/10 20:20
# https://leetcode.com/problems/permutation-sequence/
import math


class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        nums = list(range(1, n+1))
        res = ''

        k -= 1
        while n > 0:
            n -= 1
            idx, k = divmod(k, math.factorial(n))
            res += str(nums[idx])
            del nums[idx]

        return res


if __name__ == '__main__':
    solution = Solution()

    assert solution.getPermutation(3, 3) == '213'
    assert solution.getPermutation(4, 9) == '2314'