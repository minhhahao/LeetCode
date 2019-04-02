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


def printListNode(node):
    while node is not None:
        print(node.val)
        node = node.next
