#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/6 21:13
# https://leetcode.com/problems/zigzag-conversion/
import math


class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or len(s) <= numRows:
            return s
        i, step = 0, 1
        rows = [''] * numRows
        for c in s:
            rows[i] += c
            if i == 0:
                step = 1
            elif i == numRows - 1:
                step = -1
            i += step

        return ''.join(rows)


if __name__ == '__main__':
    solution = Solution()
    assert solution.convert('PAYPALISHIRING', 3) == 'PAHNAPLSIIGYIR'
    assert solution.convert('PAYPALISHIRING', 4) == 'PINALSIGYAHRPI'
