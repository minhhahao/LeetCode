#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-09-18
# https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
from src.main.python.leetcode_by_python.data_structure.ListNode import ListNode
from src.main.python.leetcode_by_python.data_structure.TreeNode import TreeNode


class Solution:
    def sortedListToBST(self, head: ListNode) -> TreeNode:
        if not head:
            return None
        return self.dfs(head, None)

    def dfs(self, head, tail):
        if head == tail:
            return None
        slow, fast = head, head
        while fast != tail and fast.next != tail:
            fast = fast.next.next
            slow = slow.next

        node = TreeNode(slow.val)
        node.left = self.dfs(head, slow)
        node.right = self.dfs(slow.next, tail)

        return node

