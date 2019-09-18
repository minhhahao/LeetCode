#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-18
import unittest

from src.main.python.leetcode_by_python.data_structure.ListNode import makeListNode
from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual, \
    printBinaryTree
from src.main.python.leetcode_by_python.tree.No109_Convert_Sorted_List_to_Binary_Search_Tree import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        sorted_linked_list = makeListNode([-10, -3, 0, 5, 9])
        expected = createBinaryTree([0, -3, -10, 9, 5], [-10, -3, 0, 5, 9])
        res = self.solution.sortedListToBST(sorted_linked_list)
        self.assertTrue(isBinaryTreeEqual(expected, res))


if __name__ == '__main__':
    unittest.main()
