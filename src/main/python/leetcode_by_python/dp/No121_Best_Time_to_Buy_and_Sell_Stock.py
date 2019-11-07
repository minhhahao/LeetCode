#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-07
from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        cur_profit = 0

        for i in range(len(prices) - 1):
            cur_profit += prices[i + 1] - prices[i]
            max_profit = max(max_profit, cur_profit)
            cur_profit = max(cur_profit, 0)

        return max_profit
