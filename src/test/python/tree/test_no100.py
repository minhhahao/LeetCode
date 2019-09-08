#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-06
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree
from src.main.python.leetcode_by_python.tree.No100_Same_Tree import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree1 = createBinaryTree([1, 2, 3], [2, 1, 3])
        tree2 = createBinaryTree([1, 2, 3], [2, 1, 3])
        self.assertEqual(self.solution.isSameTree(tree1, tree2), True)

        tree1 = createBinaryTree([1, 2], [2, 1])
        tree2 = createBinaryTree([1, 2], [1, 2])
        self.assertEqual(self.solution.isSameTree(tree1, tree2), False)

        tree1 = createBinaryTree([1, 2, 1], [2, 1, 1])
        tree2 = createBinaryTree([1, 1, 2], [1, 1, 2])
        self.assertEqual(self.solution.isSameTree(tree1, tree2), False)


if __name__ == '__main__':
    unittest.main()
