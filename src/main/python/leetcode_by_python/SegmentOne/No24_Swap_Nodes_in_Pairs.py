#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/20 20:39
from src.main.python.com.hazza.LeetCodeByPython.data_structure.ListNode import ListNode, makeListNode, printListNode


class Solution:
    # solution 1, iteratively
    def swapPairs1(self, head: ListNode) -> ListNode:
        res = cur = ListNode(0)
        res.next = head

        while cur.next and cur.next.next:
            prev = cur
            cur = cur.next
            nxt = cur.next
            prev.next = nxt
            cur.next = nxt.next
            nxt.next = cur

        return res.next

    # solution 2, recursively
    def swapPairs2(self, head: ListNode) -> ListNode:
        if head and head.next:
            tmp = head.next
            head.next = self.swapPairs2(tmp.next)
            tmp.next = head
            return tmp

        return head


if __name__ == '__main__':
    solution = Solution()
    head = makeListNode([1, 2, 3, 4])
    res = solution.swapPairs1(head)
    printListNode(res)
    print()
    head = makeListNode([1, 2, 3, 4])
    res = solution.swapPairs2(head)
    printListNode(res)
