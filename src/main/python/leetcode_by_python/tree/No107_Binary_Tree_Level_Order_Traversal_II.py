#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-15
import collections
from typing import List

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    # solution 1
    def levelOrderBottom1(self, root: TreeNode) -> List[List[int]]:
        res = []
        self.dfs(root, 0, res)

        return res

    def dfs(self, root, level, res):
        if root:
            if len(res) < level + 1:
                res.insert(0, [])
            res[-(level + 1)].append(root.val)
            self.dfs(root.left, level + 1, res)
            self.dfs(root.right, level + 1, res)

    # solution 2
    def levelOrderBottom2(self, root: TreeNode) -> List[List[int]]:
        queue, res = collections.deque([(root, 0)]), []
        while queue:
            node, level = queue.popleft()
            if node:
                if len(res) < level + 1:
                    res.insert(0, [])
                res[-(level + 1)].append(node.val)
                queue.append((node.left, level + 1))
                queue.append((node.right, level + 1))

        return res