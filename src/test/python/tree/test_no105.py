#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-12
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual
from src.main.python.leetcode_by_python.tree.No105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal import \
    Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        preorder = [3, 9, 20, 15, 7]
        inorder = [9, 3, 15, 20, 7]
        expected = createBinaryTree(preorder, inorder)
        res = self.solution.buildTree(preorder, inorder)
        self.assertTrue(isBinaryTreeEqual(expected, res))


if __name__ == '__main__':
    unittest.main()
