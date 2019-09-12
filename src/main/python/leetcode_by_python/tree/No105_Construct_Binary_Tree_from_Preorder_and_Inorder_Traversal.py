#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-12
# https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
from typing import List

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> TreeNode:
        node = None

        if preorder:
            node = TreeNode(preorder[0])
            target = inorder.index(preorder[0])
            node.left = self.buildTree(preorder[1:target + 1], inorder[:target])
            node.right = self.buildTree(preorder[target + 1:], inorder[target + 1:])

        return node
