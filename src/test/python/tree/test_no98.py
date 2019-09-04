#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-04
import unittest

from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree
from src.main.python.leetcode_by_python.tree.No98_Validate_Binary_Search_Tree import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        preOrder = [2, 1, 3]
        inOrder = [1, 2, 3]
        root = createBinaryTree(preOrder, inOrder)
        self.assertEqual(self.solution.isValidBST1(root), True)

        preOrder = [5, 1, 4, 3, 6]
        inOrder = [1, 5, 3, 4, 6]
        root = createBinaryTree(preOrder, inOrder)
        self.assertEqual(self.solution.isValidBST1(root), False)

        preOrder = [1, 1]
        inOrder = [1, 1]
        root = createBinaryTree(preOrder, inOrder)
        self.assertEqual(self.solution.isValidBST1(root), False)

    def testSolution2(self):
        preOrder = [2, 1, 3]
        inOrder = [1, 2, 3]
        root = createBinaryTree(preOrder, inOrder)
        self.assertEqual(self.solution.isValidBST2(root), True)

        preOrder = [5, 1, 4, 3, 6]
        inOrder = [1, 5, 3, 4, 6]
        root = createBinaryTree(preOrder, inOrder)
        self.assertEqual(self.solution.isValidBST2(root), False)

        preOrder = [1, 1]
        inOrder = [1, 1]
        root = createBinaryTree(preOrder, inOrder)
        self.assertEqual(self.solution.isValidBST2(root), False)




if __name__ == '__main__':
    unittest.main()
