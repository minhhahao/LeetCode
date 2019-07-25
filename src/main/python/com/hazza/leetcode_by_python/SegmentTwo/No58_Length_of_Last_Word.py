#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/8 20:50
# https://leetcode.com/problems/length-of-last-word/


class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        return len(s.rstrip(' ').split(' ')[-1])


if __name__ == '__main__':
    solution = Solution()
    assert solution.lengthOfLastWord('Hello World') == 5