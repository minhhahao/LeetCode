#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-05
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import *
from src.main.python.leetcode_by_python.tree.No99_Recover_Binary_Search_Tree import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        root = createBinaryTree([1, 3, 2], [3, 2, 1])
        expected = createBinaryTree([3, 1, 2], [1, 2, 3])
        self.solution.recoverTree1(root)
        self.assertTrue(isBinaryTreeEqual(root, expected))

    def testSolution2(self):
        root = createBinaryTree([1, 3, 2], [3, 2, 1])
        expected = createBinaryTree([3, 1, 2], [1, 2, 3])
        self.solution.recoverTree2(root)
        self.assertTrue(isBinaryTreeEqual(root, expected))


if __name__ == '__main__':
    unittest.main()
