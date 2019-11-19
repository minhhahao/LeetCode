#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-19
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree
from src.main.python.leetcode_by_python.dfs.No124_Binary_Tree_Maximum_Path_Sum import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([1, 2, 3], [2, 1, 3])
        self.assertEqual(self.solution.maxPathSum(tree), 6)

        tree = createBinaryTree([-10, 9, 20, 15, 7], [9, -10, 15, 20, 7])
        self.assertEqual(self.solution.maxPathSum(tree), 42)


if __name__ == '__main__':
    unittest.main()
