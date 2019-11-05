#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-05
from typing import List


class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        res = [1] * (rowIndex + 1)

        for i in range(rowIndex):
            for j in reversed(range(1, i + 1)):
                res[j] = res[j] + res[j - 1]

        return res