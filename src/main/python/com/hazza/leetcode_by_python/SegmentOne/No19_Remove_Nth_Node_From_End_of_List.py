#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/16 20:15
# https://leetcode.com/problems/remove-nth-node-from-end-of-list/
from src.main.python.com.hazza.LeetCodeByPython.data_structure.ListNode import ListNode, makeListNode, printListNode


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        res = ListNode(0)
        res.next = head
        slow = fast = res

        for _ in range(n):
            fast = fast.next
        while fast.next:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return res.next


if __name__ == '__main__':
    solution = Solution()
    head = makeListNode([1, 2, 3, 4, 5])
    res = solution.removeNthFromEnd(head, 2)
    printListNode(res)