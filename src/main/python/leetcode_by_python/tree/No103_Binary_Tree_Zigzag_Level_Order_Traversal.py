#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-10
# https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
from typing import List

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []

        res, level = [], [root]
        while level:
            res.append([node.val for node in level])
            if len(res) % 2:
                level = [kid for node in level[::-1] for kid in (node.right, node.left) if kid]
            else:
                level = [kid for node in level[::-1] for kid in (node.left, node.right) if kid]

        return res