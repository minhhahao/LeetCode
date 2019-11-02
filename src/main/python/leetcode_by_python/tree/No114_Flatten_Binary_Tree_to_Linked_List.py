#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-10-31
from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    # Solution 1
    def flatten1(self, root: TreeNode) -> None:
        self.prev = None

        def dfs(node):
            if not node:
                return None
            dfs(node.right)
            dfs(node.left)
            node.right = self.prev
            node.left = None
            self.prev = node

        dfs(root)

    # Solution 2
    def flatten2(self, root: TreeNode) -> None:
        if not root:
            return None
        cur = root
        while cur:
            if cur.left:
                prev = cur.left
                while prev.right:
                    prev = prev.right
                prev.right = cur.right
                cur.right = cur.left
                cur.left = None
            cur = cur.right

    # Solution 3
    def flatten3(self, root: TreeNode) -> None:
        if not root:
            return None
        stack = [root]
        while stack:
            cur = stack.pop()
            if cur.right:
                stack.append(cur.right)
            if cur.left:
                stack.append(cur.left)
            if stack:
                cur.right = stack[-1]
            cur.left = None
