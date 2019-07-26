#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/2 19:17


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def makeListNode(list):
    res = ListNode(0)
    tmp = res
    for i in list:
        tmp.next = ListNode(i)
        tmp = tmp.next

    return res.next


def isListNodeEqual(l1, l2):
    if (l1 and not l2) or (not l1 and l2):
        return False
    if not l1 and not l2:
        return True
    if l1.val == l2.val:
        return isListNodeEqual(l1.next, l2.next)

    return False


def printListNode(node):
    while node is not None:
        print(node.val)
        node = node.next
    print()
