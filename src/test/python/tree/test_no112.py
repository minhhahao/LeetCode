#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-10-20
import unittest

from src.main.python.leetcode_by_python.data_structure.ListNode import makeListNode
from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual, \
    printBinaryTree
from src.main.python.leetcode_by_python.tree.No112_Path_Sum import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([5, 4, 11, 7, 2, 8, 13, 4, 1], [7, 11, 2, 4, 5, 13, 8, 4, 1])
        self.assertEqual(self.solution.hasPathSum1(tree, 22), True)

    def testSolution2(self):
        tree = createBinaryTree([5, 4, 11, 7, 2, 8, 13, 4, 1], [7, 11, 2, 4, 5, 13, 8, 4, 1])
        self.assertEqual(self.solution.hasPathSum2(tree, 22), True)


if __name__ == '__main__':
    unittest.main()
