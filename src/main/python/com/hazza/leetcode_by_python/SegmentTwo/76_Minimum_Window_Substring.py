#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-08
# https://leetcode.com/problems/minimum-window-substring/
import collections


class Solution:
    def minWindow(self, s: str, t: str) -> str:
        need = collections.Counter(t)
        missing = len(t)
        begin, head, end = 0, 0, 0

        for tail, c in enumerate(s, 1):
            missing -= need[c] > 0
            need[c] -= 1
            if not missing:
                while head <= tail and need[s[head]] < 0:
                    need[s[head]] += 1
                    head += 1
                if not end or tail - head <= end - begin:
                    begin, end = head, tail

        return s[begin:end]


if __name__ == '__main__':
    solution = Solution()
    print(solution.minWindow('ADOBECODEBANC', 'ABC'))
    assert solution.minWindow('ADOBECODEBANC', 'ABC') == 'BANC'
