#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-03
import unittest

from src.main.python.leetcode_by_python.data_structure.Node import Node, isTreeEqual
from src.main.python.leetcode_by_python.data_structure.TreeNode import createBinaryTree, isBinaryTreeEqual, \
    printBinaryTree
from src.main.python.leetcode_by_python.tree.No116_Populating_Next_Right_Pointers_in_Each_Node import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def testSolution1(self):
        tn_1 = Node(1)
        tn_2 = Node(2)
        tn_3 = Node(3)
        tn_4 = Node(4)
        tn_5 = Node(5)
        tn_6 = Node(6)
        tn_7 = Node(7)
        tn_1.left, tn_1.right = tn_2, tn_3
        tn_2.left, tn_2.right = tn_4, tn_5
        tn_3.left, tn_3.right = tn_6, tn_7
        root = tn_1

        tn_1 = Node(1)
        tn_2 = Node(2)
        tn_3 = Node(3)
        tn_4 = Node(4)
        tn_5 = Node(5)
        tn_6 = Node(6)
        tn_7 = Node(7)
        tn_1.left, tn_1.right = tn_2, tn_3
        tn_2.left, tn_2.right = tn_4, tn_5
        tn_3.left, tn_3.right = tn_6, tn_7
        tn_2.next = tn_3
        tn_4.next = tn_5
        tn_5.next = tn_6
        tn_6.next = tn_7
        expected = tn_1

        res = self.solution.connect1(root)

        self.assertTrue(isTreeEqual(expected, res))

    def testSolution2(self):
        tn_1 = Node(1)
        tn_2 = Node(2)
        tn_3 = Node(3)
        tn_4 = Node(4)
        tn_5 = Node(5)
        tn_6 = Node(6)
        tn_7 = Node(7)
        tn_1.left, tn_1.right = tn_2, tn_3
        tn_2.left, tn_2.right = tn_4, tn_5
        tn_3.left, tn_3.right = tn_6, tn_7
        root = tn_1

        tn_1 = Node(1)
        tn_2 = Node(2)
        tn_3 = Node(3)
        tn_4 = Node(4)
        tn_5 = Node(5)
        tn_6 = Node(6)
        tn_7 = Node(7)
        tn_1.left, tn_1.right = tn_2, tn_3
        tn_2.left, tn_2.right = tn_4, tn_5
        tn_3.left, tn_3.right = tn_6, tn_7
        tn_2.next = tn_3
        tn_4.next = tn_5
        tn_5.next = tn_6
        tn_6.next = tn_7
        expected = tn_1

        res = self.solution.connect2(root)

        self.assertTrue(isTreeEqual(expected, res))

    def testSolution3(self):
        tn_1 = Node(1)
        tn_2 = Node(2)
        tn_3 = Node(3)
        tn_4 = Node(4)
        tn_5 = Node(5)
        tn_6 = Node(6)
        tn_7 = Node(7)
        tn_1.left, tn_1.right = tn_2, tn_3
        tn_2.left, tn_2.right = tn_4, tn_5
        tn_3.left, tn_3.right = tn_6, tn_7
        root = tn_1

        tn_1 = Node(1)
        tn_2 = Node(2)
        tn_3 = Node(3)
        tn_4 = Node(4)
        tn_5 = Node(5)
        tn_6 = Node(6)
        tn_7 = Node(7)
        tn_1.left, tn_1.right = tn_2, tn_3
        tn_2.left, tn_2.right = tn_4, tn_5
        tn_3.left, tn_3.right = tn_6, tn_7
        tn_2.next = tn_3
        tn_4.next = tn_5
        tn_5.next = tn_6
        tn_6.next = tn_7
        expected = tn_1

        res = self.solution.connect3(root)

        self.assertTrue(isTreeEqual(expected, res))


if __name__ == '__main__':
    unittest.main()