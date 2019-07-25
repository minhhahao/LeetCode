#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/11 21:02
# https://leetcode.com/problems/longest-common-prefix/
from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ''

        for i, grouped in enumerate(zip(*strs)):
            if len(set(grouped)) > 1:
                return strs[0][:i]

        return min(strs)


if __name__ == '__main__':
    solution = Solution()
    assert solution.longestCommonPrefix(["flower","flow","flight"]) == 'fl'
    assert solution.longestCommonPrefix(["dog","racecar","car"]) == ''
