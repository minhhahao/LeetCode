#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/15 20:07
# https://leetcode.com/problems/valid-number/


class Solution:
    def isNumber(self, s: str) -> bool:
        s = s.strip()
        numberFlag = False
        eFlag = False
        pointFlag = False
        numberAfterEFlag = False

        for i in range(len(s)):
            if '0' <= s[i] <= '9':
                numberFlag = True
                numberAfterEFlag = True
            elif s[i] == 'e':
                if not numberFlag or eFlag:
                    return False
                eFlag = True
                numberAfterEFlag = False
            elif s[i] == '.':
                if pointFlag or eFlag:
                    return False
                pointFlag = True
            elif s[i] == '-' or s[i] == '+':
                if i != 0 and s[i - 1] != 'e':
                    return False
            else:
                return False

        return numberFlag and numberAfterEFlag


if __name__ == '__main__':
    solution = Solution()

    assert solution.isNumber('0') is True
    assert solution.isNumber(' 0.1 ') is True
    assert solution.isNumber('abc') is False
    assert solution.isNumber('1 a') is False
    assert solution.isNumber('2e10') is True
    assert solution.isNumber(' -90e3   ') is True
    assert solution.isNumber(' 1e') is False
    assert solution.isNumber('e3') is False
    assert solution.isNumber(' 6e-1') is True
    assert solution.isNumber(' 99e2.5 ') is False
    assert solution.isNumber(' --6 ') is False
    assert solution.isNumber('53.5e93') is True
    assert solution.isNumber('-+3') is False
    assert solution.isNumber('95a54e53') is False