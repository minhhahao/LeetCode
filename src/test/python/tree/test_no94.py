#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-05
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, printBinaryTree
from src.main.python.leetcode_by_python.tree.No94_Binary_Tree_Inorder_Traversal import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        preOrder = [1, 2, 4, 8, 9, 5, 3, 6, 7, 10, 11]
        inOrder = [8, 4, 9, 2, 5, 1, 6, 3, 10, 11, 7]
        root = createBinaryTree(preOrder, inOrder)

        res = self.solution.inorderTraversal1(root)
        expected = [8, 4, 9, 2, 5, 1, 6, 3, 10, 11, 7]
        self.assertEqual(res, expected)

        res = self.solution.inorderTraversal1(root)
        expected = [8, 4, 9, 2, 5, 1, 6, 3, 10, 11, 7]
        self.assertEqual(res, expected)


if __name__ == '__main__':
    unittest.main()
