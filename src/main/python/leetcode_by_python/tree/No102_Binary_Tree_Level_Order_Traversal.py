#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-09
# https://leetcode.com/problems/binary-tree-level-order-traversal/
from typing import List

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []

        res, stack = [], [root]
        while stack:
            res.append([node.val for node in stack])
            stack = [kid for node in stack for kid in (node.left, node.right) if kid]

        return res


