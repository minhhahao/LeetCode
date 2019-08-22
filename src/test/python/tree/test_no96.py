#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-22
import unittest

from src.main.python.leetcode_by_python.tree.No96_Unique_Binary_Search_Trees import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        self.assertEqual(self.solution.numTrees(3), 5)


if __name__ == '__main__':
    unittest.main()
