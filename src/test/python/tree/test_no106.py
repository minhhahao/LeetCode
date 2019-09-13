#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-13
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual
from src.main.python.leetcode_by_python.tree.No106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal import \
    Solution

Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        preorder = [3, 9, 20, 15, 7]
        inorder = [9, 3, 15, 20, 7]
        postorder = [9, 15, 7, 20, 3]
        expected = createBinaryTree(preorder, inorder)
        res = self.solution.buildTree(inorder, postorder)
        self.assertTrue(isBinaryTreeEqual(expected, res))


if __name__ == '__main__':
    unittest.main()
