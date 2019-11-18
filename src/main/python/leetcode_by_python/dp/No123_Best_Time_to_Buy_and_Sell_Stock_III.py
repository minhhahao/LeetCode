#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-18
import sys
from typing import List


class Solution:
    def maxProfit1(self, prices: List[int]) -> int:
        if not prices:
            return 0

        prices_len = len(prices)
        dp = [0] * prices_len

        for _ in range(2):
            tmp_max = -prices[0]
            for i in range(1, prices_len):
                prev = dp[i]
                dp[i] = max(dp[i - 1], prices[i] + tmp_max)
                tmp_max = max(tmp_max, prev - prices[i])

        return dp[prices_len - 1]

    def maxProfit2(self, prices: List[int]) -> int:
        if not prices:
            return 0

        buy1, buy2 = -sys.maxsize, -sys.maxsize
        sell1, sell2 = 0, 0

        for p in prices:
            sell2 = max(sell2, buy2 + p)
            buy2 = max(buy2, sell1 - p)
            sell1 = max(sell1, buy1 + p)
            buy1 = max(buy1, -p)

        return sell2

