#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-18
import unittest

from src.main.python.leetcode_by_python.dp.No123_Best_Time_to_Buy_and_Sell_Stock_III import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        self.assertEqual(6, self.solution.maxProfit1([3, 3, 5, 0, 0, 3, 1, 4]))
        self.assertEqual(4, self.solution.maxProfit1([1, 2, 3, 4, 5]))
        self.assertEqual(0, self.solution.maxProfit1([7, 6, 4, 3, 1]))

    def testSolution2(self):
        self.assertEqual(6, self.solution.maxProfit2([3, 3, 5, 0, 0, 3, 1, 4]))
        self.assertEqual(4, self.solution.maxProfit2([1, 2, 3, 4, 5]))
        self.assertEqual(0, self.solution.maxProfit2([7, 6, 4, 3, 1]))


if __name__ == '__main__':
    unittest.main()
