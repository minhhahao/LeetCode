#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/18 20:53
# https://leetcode.com/problems/generate-parentheses/
from typing import List


class Solution:
    # solution 1
    def generateParenthesis1(self, n: int) -> List[str]:
        def insertBrackets(leftBracketsNum, rightBracketsNum, n, str, res):
            if leftBracketsNum + rightBracketsNum == 2 * n:
                res.append(str)
            else:
                if leftBracketsNum < n:
                    insertBrackets(leftBracketsNum + 1, rightBracketsNum, n, str + '(', res)
                if rightBracketsNum < leftBracketsNum:
                    insertBrackets(leftBracketsNum, rightBracketsNum + 1, n, str + ')', res)

        res = []
        insertBrackets(0, 0, n, '', res)

        return res

    #solution 2
    def generateParenthesis2(self, n: int) -> List[str]:
        res = [['']]
        for i in range(1, n + 1):
            res.append(['(' + first + ')' + second for j in range(i) for first in res[j] for second in res[i - j - 1]])

        return res[-1]


if __name__ == '__main__':
    solution = Solution()
    assert sorted(solution.generateParenthesis1(3)) == sorted(["((()))", "(()())", "(())()", "()(())", "()()()"])
    assert sorted(solution.generateParenthesis2(3)) == sorted(["((()))", "(()())", "(())()", "()(())", "()()()"])
    assert sorted(solution.generateParenthesis2(10)) == sorted(solution.generateParenthesis2(10))