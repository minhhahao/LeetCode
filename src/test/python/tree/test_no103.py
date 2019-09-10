#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-10
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree
from src.main.python.leetcode_by_python.tree.No103_Binary_Tree_Zigzag_Level_Order_Traversal import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([3, 9, 20, 15, 7], [9, 3, 15, 20, 7])
        expected = [
            [3],
            [20, 9],
            [15, 7]
        ]
        self.assertEqual(self.solution.zigzagLevelOrder(tree), expected)

    # def testSolution2(self):
    #     tree = createBinaryTree([3, 9, 20, 15, 7], [9, 3, 15, 20, 7])
    #     self.assertEqual(self.solution.levelOrder2(tree), True)


if __name__ == '__main__':
    unittest.main()
