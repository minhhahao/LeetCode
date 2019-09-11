#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-11
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree
from src.main.python.leetcode_by_python.tree.No104_Maximum_Depth_of_Binary_Tree import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([3, 9, 20, 15, 7], [9, 3, 15, 20, 7])
        self.assertEqual(self.solution.maxDepth(tree), 3)


if __name__ == '__main__':
    unittest.main()
