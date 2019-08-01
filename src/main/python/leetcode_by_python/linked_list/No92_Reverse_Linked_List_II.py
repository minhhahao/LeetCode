#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-01
#https://leetcode.com/problems/reverse-linked-list-ii/
from src.main.python.leetcode_by_python.data_structure.ListNode import ListNode


class Solution:
    def reverseBetween(self, head: ListNode, m: int, n: int) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy

        for _ in range(m - 1):
            prev = prev.next

        cur = prev.next
        right = cur.next
        for _ in range(n - m):
            right.next, cur, right = cur, right, right.next

        prev.next.next, prev.next = right, cur

        return dummy.next



