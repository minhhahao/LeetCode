#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/22 20:59
# https://leetcode.com/problems/implement-strstr/


class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        def getNext(needle):
            strLen = len(needle)
            next = [-1] * strLen

            j = -1
            for i in range(1, strLen):
                while j > -1 and needle[i] != needle[j + 1]:
                    j = next[j]
                if needle[i] == needle[j + 1]:
                    j += 1

                next[i] = j

            return next

        if needle == '':
            return 0

        next = getNext(needle)

        haystackLen = len(haystack)
        needleLen = len(needle)
        j = -1

        for i in range(haystackLen):
            while j > -1 and haystack[i] != needle[j + 1]:
                j = next[j]
            if haystack[i] == needle[j + 1]:
                j += 1
            if j == needleLen - 1:
                return i - j

        return -1


if __name__ == '__main__':
    solution = Solution()
    assert solution.strStr('a', '') == 0
    assert solution.strStr('hello', 'll') == 2
    assert solution.strStr('bba', 'll') == -1
    assert solution.strStr('abacaabacabacabaabb', 'abacab') == 5
