#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-07
import unittest

from src.main.python.leetcode_by_python.dp.No121_Best_Time_to_Buy_and_Sell_Stock import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        self.assertEqual(5, self.solution.maxProfit([7, 1, 5, 3, 6, 4]))
        self.assertEqual(0, self.solution.maxProfit([7, 6, 4, 3, 1]))


if __name__ == '__main__':
    unittest.main()
