#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-05
# https://leetcode.com/problems/binary-tree-inorder-traversal/
from typing import List

from src.main.python.leetcode_by_python.data_structure import TreeNode


class Solution:
    def inorderTraversal1(self, root: TreeNode) -> List[int]:
        def dfs(node):
            if node:
                dfs(node.left)
                res.append(node.val)
                dfs(node.right)

        res = []
        dfs(root)

        return res

    def inorderTraversal2(self, root: TreeNode) -> List[int]:
        res = []
        stack = []
        node = root

        while node or len(stack) > 0:
            while node:
                stack.append(node)
                node = node.left
            node = stack.pop()
            res.append(node.val)
            node = node.right

        return res
