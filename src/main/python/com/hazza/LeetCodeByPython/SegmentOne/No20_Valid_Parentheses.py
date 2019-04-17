#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/17 20:04
# https://leetcode.com/problems/valid-parentheses/


class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        dict = {')': '(', ']': '[', '}': '{'}
        for c in s:
            if c in dict.values():
                stack.append(c)
            else:
                if len(stack) == 0 or stack.pop() != dict[c]:
                    return False

        return len(stack) == 0


if __name__ == '__main__':
    solution = Solution()
    assert solution.isValid('()') is True
    assert solution.isValid('()[]{}') is True
    assert solution.isValid('(]') is False
    assert solution.isValid('([)]') is False
    assert solution.isValid('{[]}') is True
