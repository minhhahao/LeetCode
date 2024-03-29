#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-29
import unittest

from src.main.python.leetcode_by_python.bit.No89_Gray_Code import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        self.assertEqual(self.solution.grayCode(0), [0])
        self.assertTrue(self.solution.grayCode(2) in [[0, 1, 3, 2], [0, 2, 3, 1]])


if __name__ == '__main__':
    unittest.main()
