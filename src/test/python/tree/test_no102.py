#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-09
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree
from src.main.python.leetcode_by_python.tree.No102_Binary_Tree_Level_Order_Traversal import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([3, 9, 20, 15, 7], [9, 3, 15, 20, 7])
        expected = [
            [3],
            [9, 20],
            [15, 7]
        ]
        self.assertEqual(self.solution.levelOrder(tree), expected)


if __name__ == '__main__':
    unittest.main()
