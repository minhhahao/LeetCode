#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-19
# https://leetcode.com/problems/remove-duplicates-from-sorted-list/
from src.main.python.com.hazza.LeetCodeByPython.data_structure.ListNode import ListNode, makeListNode, isListNodeEqual


class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        temp = ListNode(0)
        temp.next = head
        cur = head

        while cur:
            while cur.next and cur.val == cur.next.val:
                cur.next = cur.next.next
            cur = cur.next

        return temp.next


if __name__ == '__main__':
    solution = Solution()

    head = makeListNode([1, 1, 2])
    expected = makeListNode([1, 2])
    res = solution.deleteDuplicates(head)
    assert isListNodeEqual(res, expected)

    head = makeListNode([1, 1, 2, 3, 3])
    expected = makeListNode([1, 2, 3])
    res = solution.deleteDuplicates(head)
    assert isListNodeEqual(res, expected)
