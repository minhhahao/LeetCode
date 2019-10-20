#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-10-20
from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def hasPathSum1(self, root: TreeNode, sum: int) -> bool:
        if not root:
            return False

        sum -= root.val
        if not root.left and not root.right and sum == 0:
            return True

        return self.hasPathSum1(root.left, sum) or self.hasPathSum1(root.right, sum)

    def hasPathSum2(self, root: TreeNode, sum: int) -> bool:
        if not root:
            return False
        stack = [root]

        while stack:
            cur = stack[-1]
            stack.pop()

            if not cur.left and not cur.right and cur.val == sum:
                return True
            if cur.left:
                cur.left.val += cur.val
                stack.append(cur.left)
            if cur.right:
                cur.right.val += cur.val
                stack.append(cur.right)

        return False
