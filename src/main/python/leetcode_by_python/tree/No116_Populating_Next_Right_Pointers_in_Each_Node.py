#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-03
from src.main.python.leetcode_by_python.data_structure.Node import Node


class Solution:
    def connect1(self, root: Node) -> Node:
        if not root:
            return None
        queue = [root]

        while queue:
            l = len(queue)
            for i in range(l):
                node = queue.pop(0)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                node.next = None if i == l -1 else queue[0]

        return root

    def connect2(self, root: Node) -> Node:
        cur = root
        while cur and cur.left:
            next = cur.left
            while cur:
                cur.left.next = cur.right
                cur.right.next = cur.next and cur.next.left
                cur = cur.next
            cur = next

        return root

    def connect3(self, root: Node) -> Node:
        def dfs(node):
            if not node:
                return
            if node.left:
                node.left.next = node.right
                if node.next:
                    node.right.next = node.next.left
            dfs(node.left)
            dfs(node.right)

        dfs(root)
        return root

