#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-02

import unittest

from src.main.python.leetcode_by_python.data_structure.ListNode import makeListNode
from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual, \
    printBinaryTree
from src.main.python.leetcode_by_python.dp.No115_Distinct_Subsequences import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        self.assertEqual(3, self.solution.numDistinct('rabbbit', 'rabbit'))
        self.assertEqual(5, self.solution.numDistinct('babgbag', 'bag'))


if __name__ == '__main__':
    unittest.main()

