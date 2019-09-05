#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-05
# https://leetcode.com/problems/recover-binary-search-tree/
import sys

from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    # solution 1
    def __init__(self):
        self.firstNode, self.secondNode, self.prevNode = None, None, TreeNode(-sys.maxsize - 1)

    def recoverTree1(self, root: TreeNode) -> None:
        if not root:
            return
        self.firstNode, self.secondNode, self.prevNode = None, None, TreeNode(-sys.maxsize - 1)
        self.dfs(root)
        self.firstNode.val, self.secondNode.val = self.secondNode.val, self.firstNode.val

    def dfs(self, root):
        if not root:
            return
        self.dfs(root.left)

        if not self.firstNode and self.prevNode.val >= root.val:
            self.firstNode = self.prevNode
        if self.firstNode and self.prevNode.val >= root.val:
            self.secondNode = root
        self.prevNode = root

        self.dfs(root.right)

    # solution 2
    def recoverTree2(self, root: TreeNode) -> None:
        firstNode, secondNode, prevNode, tempNode = None, None, None, None

        while root:
            if root.left:
                tempNode = root.left
                while tempNode.right and tempNode.right != root:
                    tempNode = tempNode.right
                if tempNode.right:
                    if prevNode and prevNode.val >= root.val:
                        if not firstNode:
                            firstNode, secondNode = prevNode, root
                        else:
                            secondNode = root
                    prevNode = root
                    tempNode.right = None
                    root = root.right
                else:
                    tempNode.right = root
                    root = root.left
            else:
                if prevNode and prevNode.val >= root.val:
                    if not firstNode:
                        firstNode, secondNode = prevNode, root
                    else:
                        secondNode = root
                prevNode = root
                root = root.right

        if firstNode and secondNode:
            firstNode.val, secondNode.val = secondNode.val, firstNode.val
