#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-10-31
import unittest

from src.main.python.leetcode_by_python.data_structure.ListNode import makeListNode
from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual, \
    printBinaryTree
from src.main.python.leetcode_by_python.tree.No114_Flatten_Binary_Tree_to_Linked_List import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([1, 2, 3, 4, 5, 6], [3, 2, 4, 1, 5, 6])
        expected = createBinaryTree([1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6])
        self.solution.flatten1(tree)
        printBinaryTree(tree)
        self.assertTrue(isBinaryTreeEqual(tree, expected))

    def testSolution2(self):
        tree = createBinaryTree([1, 2, 3, 4, 5, 6], [3, 2, 4, 1, 5, 6])
        expected = createBinaryTree([1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6])
        self.solution.flatten2(tree)
        printBinaryTree(tree)
        self.assertTrue(isBinaryTreeEqual(tree, expected))

    def testSolution3(self):
        tree = createBinaryTree([1, 2, 3, 4, 5, 6], [3, 2, 4, 1, 5, 6])
        expected = createBinaryTree([1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6])
        self.solution.flatten3(tree)
        printBinaryTree(tree)
        self.assertTrue(isBinaryTreeEqual(tree, expected))


if __name__ == '__main__':
    unittest.main()