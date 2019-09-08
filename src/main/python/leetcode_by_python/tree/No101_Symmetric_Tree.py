#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-08
# https://leetcode.com/problems/symmetric-tree/
from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    # solution 1
    def isSymmetric1(self, root: TreeNode) -> bool:
        if not root:
            return True
        return self.isSame(root.left, root.right)

    def isSame(self, leftPart, rightPart):
        if (leftPart is None) ^ (rightPart is None):
            return False
        if not leftPart and not rightPart:
            return True

        return leftPart.val == rightPart.val and self.isSame(
            leftPart.left, rightPart.right) and self.isSame(
            leftPart.right, rightPart.left)

    # solution 2
    def isSymmetric2(self, root: TreeNode) -> bool:
        if not root:
            return True

        stack = []
        if root.left and root.right:
            stack.append(root.left)
            stack.append(root.right)
        elif (root.left is None) ^ (root.right is None):
            return False

        while stack:
            right, left = stack.pop(), stack.pop()
            if right.val != left.val:
                return False

            if left.left and right.right:
                stack.append(left.left)
                stack.append(right.right)
            elif (left.left is None) ^ (right.right is None):
                return False

            if left.right and right.left:
                stack.append(left.right)
                stack.append(right.left)
            elif (left.right is None) ^ (right.left is None):
                return False

        return True

