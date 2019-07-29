#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-29
# https://leetcode.com/problems/gray-code/
from typing import List


class Solution:
    def grayCode(self, n: int) -> List[int]:
        res = [0]
        for i in range(n):
            res += [x | (1 << i) for x in res[::-1]]
        return res
