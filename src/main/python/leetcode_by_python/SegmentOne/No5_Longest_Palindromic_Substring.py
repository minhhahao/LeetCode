#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/5 19:20
# https://leetcode.com/problems/longest-palindromic-substring/


class Solution:
    def isPalindrome(self, s, left, right):
        if left < 0:
            return False

        return s[left:right + 1] == s[left:right + 1][::-1]

    def longestPalindrome(self, s: str) -> str:
        res = ""
        curLen = 0
        for i in range(len(s)):
            if self.isPalindrome(s, i - curLen - 1, i):
                res = s[i - curLen - 1:i + 1]
                curLen += 2
            elif self.isPalindrome(s, i - curLen, i):
                res = s[i - curLen:i + 1]
                curLen += 1
        return res


if __name__ == '__main__':
    solution = Solution()
    assert solution.longestPalindrome("babad") == "bab"
    assert solution.longestPalindrome("cbbd") == "bb"