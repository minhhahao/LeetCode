#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-06
import unittest

from src.main.python.leetcode_by_python.dp.No120_Triangle import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        triangle = [
            [2],
            [3, 4],
            [6, 5, 7],
            [4, 1, 8, 3]
        ]

        self.assertEqual(11, self.solution.minimumTotal1(triangle))

    def testSolution2(self):
        triangle = [
            [2],
            [3, 4],
            [6, 5, 7],
            [4, 1, 8, 3]
        ]

        self.assertEqual(11, self.solution.minimumTotal2(triangle))


if __name__ == '__main__':
    unittest.main()
