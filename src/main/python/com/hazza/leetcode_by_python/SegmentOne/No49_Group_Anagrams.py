#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/19 20:53
# https://leetcode.com/problems/group-anagrams/
from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m = {}

        for w in strs:
            key = ''.join(sorted(w))
            m[key] = m.get(key, []) + [w]

        return list(m.values())


if __name__ == '__main__':
    solution = Solution()

    expected = [["ate", "eat", "tea"],
                ["nat", "tan"],
                ["bat"]]
    res = sorted(solution.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
    expected = sorted(list(map(sorted, expected)))
    res = sorted(list(map(sorted, res)))
    assert res == expected