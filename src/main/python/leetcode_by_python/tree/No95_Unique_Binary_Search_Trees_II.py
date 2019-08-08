#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-08
# https://leetcode.com/problems/unique-binary-search-trees-ii/
from typing import List

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def generateTrees(self, n: int) -> List[TreeNode]:
        def dfs(start, end):
            nodes = []
            if start > end:
                nodes.append(None)
                return nodes
            if start == end:
                nodes.append(TreeNode(start))
                return nodes

            for i in range(start, end + 1):
                left = dfs(start, i - 1)
                right = dfs(i + 1, end)
                for ln in left:
                    for rn in right:
                        root = TreeNode(i)
                        root.left = ln
                        root.right = rn
                        nodes.append(root)

            return nodes

        if not n:
            return []
        res = dfs(1, n)

        return res
