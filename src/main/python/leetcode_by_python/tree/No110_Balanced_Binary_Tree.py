#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-19
# https://leetcode.com/problems/balanced-binary-tree/discuss/?currentPage=1&orderBy=most_votes&query=
from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    # solution 1
    def isBalanced1(self, root: TreeNode) -> bool:
        if not root:
            return True
        leftDepth = self.depth(root.left)
        rightDepth = self.depth(root.right)

        return abs(leftDepth - rightDepth) <= 1 and \
            self.isBalanced1(root.left) and \
            self.isBalanced1(root.right)

    def depth(self, node):
        if not node:
            return 0
        return max(self.depth(node.left), self.depth(node.right)) + 1

    # solution 2
    def isBalanced2(self, root: TreeNode) -> bool:
        return self.dfs(root) != -1

    def dfs(self, node):
        if not node:
            return 0
        leftDepth = self.dfs(node.left)
        if leftDepth == -1:
            return -1
        rightDepth = self.dfs(node.right)
        if rightDepth == -1:
            return -1
        if abs(leftDepth - rightDepth) > 1:
            return -1

        return max(leftDepth, rightDepth) + 1
