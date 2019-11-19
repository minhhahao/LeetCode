#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-19
import sys

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def maxPathSum(self, root: TreeNode) -> int:
        def dfs(node):
            if not node:
                return 0
            left = max(0, dfs(node.left))
            right = max(0, dfs(node.right))
            self.cur_max = max(self.cur_max, left + right + node.val)

            return max(left, right) + node.val

        self.cur_max = -sys.maxsize
        if not root:
            return 0
        dfs(root)

        return self.cur_max
