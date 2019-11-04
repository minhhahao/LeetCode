#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-04
from src.main.python.leetcode_by_python.data_structure.Node import Node


class Solution:
    # solution 1
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

    # solution 2
    def connect2(self, root: Node) -> Node:
        next = temp = Node(0)
        cur = root
        while cur:
            next.next = cur.left
            if next.next:
                next = next.next
            next.next = cur.right
            if next.next:
                next = next.next
            cur = cur.next
            if not cur:
                next = temp
                cur = temp.next
        return root
