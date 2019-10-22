#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-10-22
from typing import List

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def pathSum(self, root: TreeNode, sum: int) -> List[List[int]]:
        res = []
        self.dfs(root, sum, [], res)

        return res

    def dfs(self, node, sum, path, res):
        if not node:
            return

        sum -= node.val
        if not node.left and not node.right and sum == 0:
            res.append(path + [node.val])
            return
        self.dfs(node.left, sum, path + [node.val], res)
        self.dfs(node.right, sum, path + [node.val], res)
