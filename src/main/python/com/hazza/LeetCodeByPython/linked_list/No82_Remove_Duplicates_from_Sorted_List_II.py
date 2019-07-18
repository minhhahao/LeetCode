#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-18
# https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
from src.main.python.com.hazza.LeetCodeByPython.data_structure.ListNode import makeListNode, isListNodeEqual, ListNode, \
    printListNode


class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        temp = ListNode(0)
        temp.next = head
        pre = temp

        while pre.next:
            isDuplicate = False
            cur = pre.next
            while cur.next and cur.next.val == cur.val:
                cur = cur.next
                isDuplicate = True
            if isDuplicate:
                pre.next = cur.next
            else:
                pre = pre.next

        return temp.next


if __name__ == '__main__':
    solution = Solution()

    head = makeListNode([1, 2, 3, 3, 4, 4, 5])
    expected = makeListNode([1, 2, 5])
    res = solution.deleteDuplicates(head)
    printListNode(res)
    assert isListNodeEqual(res, expected)

    head = makeListNode([1, 1, 1, 2, 3])
    expected = makeListNode([2, 3])
    res = solution.deleteDuplicates(head)
    printListNode(res)
    assert isListNodeEqual(res, expected)
