#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/17 19:59
# https://leetcode.com/problems/add-binary/


class Solution:
    def addBinary(self, a: str, b: str) -> str:
        if len(a) == 0:
            return b
        if len(b) == 0:
            return a

        if a[-1] == '1' and b[-1] == '1':
            return self.addBinary(self.addBinary(a[:-1], b[:-1]), '1') + '0'
        elif a[-1] == '0' and b[-1] == '0':
            return self.addBinary(a[:-1], b[:-1]) + '0'
        else:
            return self.addBinary(a[:-1], b[:-1]) + '1'


if __name__ == '__main__':
    solution = Solution()

    assert solution.addBinary('11', '1') == '100'
    assert solution.addBinary('1010', '1011') == '10101'
    assert solution.addBinary('1', '111') == '1000'
