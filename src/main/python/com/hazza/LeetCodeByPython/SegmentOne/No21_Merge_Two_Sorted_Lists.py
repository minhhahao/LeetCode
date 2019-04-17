#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/17 20:22
# https://leetcode.com/problems/merge-two-sorted-lists/
from src.main.python.com.hazza.LeetCodeByPython.dataStructure.ListNode import ListNode, makeListNode, printListNode


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1 or not l2:
            return l1 or l2
        if l1.val < l2.val:
            l1.next = self.mergeTwoLists(l1.next, l2)
            return l1
        else:
            l2.next = self.mergeTwoLists(l1, l2.next)
            return l2


if __name__ == '__main__':
    solution = Solution()
    l1 = makeListNode([1, 2, 4])
    l2 = makeListNode([1, 3, 4])
    res = solution.mergeTwoLists(l1, l2)
    printListNode(res)