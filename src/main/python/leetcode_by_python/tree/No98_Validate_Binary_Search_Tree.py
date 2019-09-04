#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-04
# https://leetcode.com/problems/validate-binary-search-tree/
import sys

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def isValidBST1(self, root: TreeNode) -> bool:
        def dfs(node, minVal, maxVal):
            if not node:
                return True
            if node.val >= maxVal or node.val <= minVal:
                return False
            return dfs(node.left, minVal, node.val) and dfs(node.right, node.val, maxVal)

        return dfs(root, -sys.maxsize - 1, sys.maxsize)

    def isValidBST2(self, root: TreeNode) -> bool:
        if not root:
            return True
        stack = []

        pre, cur = None, root
        while cur or stack:
            while cur:
                stack.append(cur)
                cur = cur.left
            cur = stack.pop()
            if pre and pre.val >= cur.val:
                return False
            pre = cur
            cur = cur.right

        return True
