#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/2 19:16
# https://leetcode.com/problems/add-two-numbers/

from ListNode import ListNode, makeListNode, printListNode


def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
    res = ListNode(0)
    tmp = res
    left = 0

    while l1 or l2 or left:
        left, right = divmod(sum(l and l.val or 0 for l in (l1, l2)) + left, 10)
        tmp.next = ListNode(right)
        tmp = tmp.next
        l1 = l1 and l1.next
        l2 = l2 and l2.next

    return res.next


if __name__ == '__main__':
    l1 = makeListNode([2, 4, 3])
    l2 = makeListNode([5, 6, 4])
    res = addTwoNumbers(None, l1, l2)
    printListNode(res)
