#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-08
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree
from src.main.python.leetcode_by_python.tree.No101_Symmetric_Tree import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([1, 2, 3, 4, 2, 4, 3], [3, 2, 4, 1, 4, 2, 3])
        self.assertEqual(self.solution.isSymmetric1(tree), True)

        tree = createBinaryTree([1, 2, 3, 2, 3], [2, 3, 1, 2, 3])
        self.assertEqual(self.solution.isSymmetric1(tree), False)

    def testSolution2(self):
        tree = createBinaryTree([1, 2, 3, 4, 2, 4, 3], [3, 2, 4, 1, 4, 2, 3])
        self.assertEqual(self.solution.isSymmetric2(tree), True)

        tree = createBinaryTree([1, 2, 3, 2, 3], [2, 3, 1, 2, 3])
        self.assertEqual(self.solution.isSymmetric2(tree), False)


if __name__ == '__main__':
    unittest.main()



