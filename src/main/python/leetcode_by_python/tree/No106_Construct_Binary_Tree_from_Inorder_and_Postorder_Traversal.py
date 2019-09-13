#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-13
from typing import List

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> TreeNode:
        node = None

        if postorder:
            node = TreeNode(postorder[-1])
            target = inorder.index(postorder[-1])
            node.left = self.buildTree(inorder[:target], postorder[:target])
            node.right = self.buildTree(inorder[target + 1:], postorder[target:-1])

        return node

