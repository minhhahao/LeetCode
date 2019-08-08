#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-08
import unittest

from src.main.python.leetcode_by_python.tree.No95_Unique_Binary_Search_Trees_II import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        self.assertEqual(len(self.solution.generateTrees(3)), 5)


if __name__ == '__main__':
    unittest.main()
