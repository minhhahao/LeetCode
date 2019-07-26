#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/8 20:57
# https://leetcode.com/problems/string-to-integer-atoi/


class Solution(object):
    def myAtoi(self, s):
        ls = list(s.strip())
        if len(ls) == 0:
            return 0

        sign = -1 if ls[0] == '-' else 1
        if ls[0] in ['-', '+']:
            del ls[0]
        res, i = 0, 0
        while i < len(ls) and ls[i].isdigit():
            res = res * 10 + ord(ls[i]) - ord('0')
            i += 1
        return max(-2 ** 31, min(sign * res, 2 ** 31 - 1))


if __name__ == '__main__':
    solution = Solution()
    assert solution.myAtoi('42') == 42
    assert solution.myAtoi('   -42') == -42
    assert solution.myAtoi('4193 with words') == 4193
    assert solution.myAtoi('words and 987') == 0
    assert solution.myAtoi('-91283472332') == -2147483648