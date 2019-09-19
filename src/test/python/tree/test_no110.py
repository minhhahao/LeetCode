#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-19
import unittest

from src.main.python.leetcode_by_python.data_structure.ListNode import makeListNode
from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual, \
    printBinaryTree
from src.main.python.leetcode_by_python.tree.No110_Balanced_Binary_Tree import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([3, 9, 20, 15, 7], [9, 3, 15, 20, 7])
        self.assertEqual(self.solution.isBalanced1(tree), True)

        tree = createBinaryTree([1, 2, 3, 4, 4, 3, 2], [4, 3, 4, 2, 3, 1, 2])
        self.assertEqual(self.solution.isBalanced1(tree), False)

    def testSolution2(self):
        tree = createBinaryTree([3, 9, 20, 15, 7], [9, 3, 15, 20, 7])
        self.assertEqual(self.solution.isBalanced2(tree), True)

        tree = createBinaryTree([1, 2, 3, 4, 4, 3, 2], [4, 3, 4, 2, 3, 1, 2])
        self.assertEqual(self.solution.isBalanced2(tree), False)


if __name__ == '__main__':
    unittest.main()
