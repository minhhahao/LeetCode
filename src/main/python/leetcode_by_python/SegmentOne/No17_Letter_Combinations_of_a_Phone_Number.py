#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/14 20:44
# https://leetcode.com/problems/letter-combinations-of-a-phone-number/
from typing import List


class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        mapping = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl', '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
        if len(digits) == 0:
            return []
        if len(digits) == 1:
            return list(mapping[digits[0]])
        prev = self.letterCombinations(digits[:-1])
        cur = mapping[digits[-1]]

        return [i + j for i in prev for j in cur]


if __name__ == '__main__':
    solution = Solution()
    assert sorted(solution.letterCombinations('23')) == sorted(["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"])