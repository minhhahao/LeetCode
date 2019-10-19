#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-10-19
from src.main.python.leetcode_by_python.data_structure import TreeNode


class Solution:
    def minDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        depths = list(map(self.minDepth, (root.left, root.right)))

        return 1 + (min(depths) or max(depths))

