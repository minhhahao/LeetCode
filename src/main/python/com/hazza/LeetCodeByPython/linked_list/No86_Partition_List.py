#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-24
# https://leetcode.com/problems/partition-list/
from src.main.python.com.hazza.LeetCodeByPython.data_structure.ListNode import ListNode, makeListNode, isListNodeEqual


class Solution:
    def partition(self, head: ListNode, x: int) -> ListNode:
        if not head:
            return None
        smallStart, bigStart = ListNode(0), ListNode(0)
        smallPart, bigPart = smallStart, bigStart
        smallStart.next, bigStart.next = smallPart, bigPart

        while head:
            if head.val < x:
                smallPart.next = head
                smallPart = smallPart.next
            else:
                bigPart.next = head
                bigPart = bigPart.next
            head = head.next

        bigPart.next = None
        smallPart.next = bigStart.next

        return smallStart.next


if __name__ == '__main__':
    solution = Solution()

    head = makeListNode([1, 4, 3, 2, 5, 2])
    expected = makeListNode([1, 2, 2, 4, 3, 5])
    res = solution.partition(head, 3)
    assert isListNodeEqual(res, expected)

    head = makeListNode([1])
    expected = makeListNode([1])
    res = solution.partition(head, 2)
    assert isListNodeEqual(res, expected)