#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-11
# https://leetcode.com/problems/maximum-depth-of-binary-tree/
from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0

        return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1

