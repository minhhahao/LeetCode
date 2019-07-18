#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/11 19:48
# https://leetcode.com/problems/rotate-list/
from src.main.python.com.hazza.LeetCodeByPython.data_structure.ListNode import ListNode, makeListNode, printListNode


class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if not head or k < 1:
            return head
        pre = ListNode(0)
        pre.next = head
        cur, tail = pre, pre
        cnt = 0

        while tail.next:
            tail = tail.next
            cnt += 1

        k = cnt - k % cnt
        cur = head
        for _ in range(1, k):
            cur = cur.next
        tail.next = pre.next
        pre.next = cur.next
        cur.next = None

        return pre.next


if __name__ == '__main__':
    solution = Solution()

    node = makeListNode([1, 2, 3, 4, 5])
    res = solution.rotateRight(node, 2)
    printListNode(res)

    node = makeListNode([0, 1, 2])
    res = solution.rotateRight(node, 4)
    printListNode(res)

    node = makeListNode([1])
    res = solution.rotateRight(node, 1)
    printListNode(res)
