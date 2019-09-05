#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-05
# https://leetcode.com/problems/recover-binary-search-tree/
import sys

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def __init__(self):
        self.firstNode, self.secondNode, self.prevNode = None, None, TreeNode(-sys.maxsize - 1)

    def recoverTree(self, root: TreeNode) -> None:
        if not root:
            return
        self.dfs(root)
        self.firstNode.val, self.secondNode.val = self.secondNode.val, self.firstNode.val

    def dfs(self, root):
        if not root:
            return
        self.dfs(root.left)

        if not self.firstNode and self.prevNode.val >= root.val:
            self.firstNode = self.prevNode
        if self.firstNode and self.prevNode.val >= root.val:
            self.secondNode = root
        self.prevNode = root

        self.dfs(root.right)
