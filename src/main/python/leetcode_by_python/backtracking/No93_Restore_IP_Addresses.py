#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-02
# https://leetcode.com/problems/restore-ip-addresses/
from typing import List


class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        def dfs(start, path):
            if len(path) == 4 and start >= n:
                res.append(".".join(path))
                return
            if len(path) == 4 and start < n:
                return
            if len(path) > 4:
                return

            for i in range(1, min(4, n - start + 1)):
                tmp = s[start:start + i]
                if not (int(tmp) > 255 or i > 1 and tmp[0] == "0"):
                    dfs(start + i, path + [tmp])

        n = len(s)
        res = []
        dfs(0, [])

        return res
