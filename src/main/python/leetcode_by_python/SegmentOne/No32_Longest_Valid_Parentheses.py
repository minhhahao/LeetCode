#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/27 19:28
# https://leetcode.com/problems/longest-valid-parentheses/


class Solution:
    def longestValidParentheses1(self, s: str) -> int:
        res, l = 0, -1
        stack = []

        for i, c in enumerate(s):
            if c == '(':
                stack.append(i)
            else:
                if not len(stack):
                    l = i
                else:
                    stack.pop()
                    if not len(stack):
                        res = max(res, i - l)
                    else:
                        res = max(res, i - stack[-1])

        return res

    def longestValidParentheses2(self, s: str) -> int:
        longest = [0] * (len(s) + 1)
        res = 0

        for i in range(1, len(s)):
            if s[i] == ')':
                if s[i - 1] == '(':
                    longest[i] = longest[i - 2] + 2 if i > 1 else 2
                else:
                    prev = i - longest[i - 1] - 1
                    if prev >= 0 and s[prev] == '(':
                        longest[i] = longest[i - 1] + 2 + (longest[prev - 1] if prev > 0 else 0)
            res = max(res, longest[i])

        return res


if __name__ == '__main__':
    solution = Solution()

    assert solution.longestValidParentheses1('(()') == 2
    assert solution.longestValidParentheses1(')()())') == 4

    assert solution.longestValidParentheses2('(()') == 2
    assert solution.longestValidParentheses2(')()())') == 4
