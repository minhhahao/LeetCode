#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/3 19:31
# https://leetcode.com/problems/longest-substring-without-repeating-characters/


def lengthOfLongestSubstring(self, s: str) -> int:
    maxLen = 0
    start = i = 0
    used = {}
    for i in range(len(s)):
        if s[i] in used and start <= used[s[i]]:
            start = used[s[i]] + 1
        else:
            maxLen = max(maxLen, i - start + 1)
        used[s[i]] = i

    return maxLen


if __name__ == '__main__':
    assert lengthOfLongestSubstring(None, "abcabcbb") == 3
    assert lengthOfLongestSubstring(None, "bbbbb") == 1
    assert lengthOfLongestSubstring(None, "pwwkew") == 3