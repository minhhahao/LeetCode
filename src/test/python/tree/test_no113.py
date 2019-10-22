#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-10-22
import unittest

from src.main.python.leetcode_by_python.data_structure.ListNode import makeListNode
from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual, \
    printBinaryTree
from src.main.python.leetcode_by_python.tree.No113_Path_Sum_II import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tree = createBinaryTree([5, 4, 11, 7, 2, 8, 13, 4, 5, 1], [7, 11, 2, 4, 5, 13, 8, 5, 4, 1])
        expected = [[5, 4, 11, 2], [5, 8, 4, 5]]
        res = self.solution.pathSum(tree, 22)
        self.assertEqual(sorted(expected), sorted(res))

    # def testSolution2(self):
    #     tree = createBinaryTree([5, 4, 11, 7, 2, 8, 13, 4, 5, 1], [7, 11, 2, 4, 5, 13, 8, 5, 4, 1])
    #     self.assertEqual(self.solution.hasPathSum2(tree, 22), True)


if __name__ == '__main__':
    unittest.main()
