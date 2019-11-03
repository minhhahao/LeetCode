#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-03


class Node:
    def __init__(self, val, left=None, right=None, next=None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next


def isTreeEqual(n1, n2):
    if (n1 is None) ^ (n2 is None):
        return False
    if not n1:
        return True

    return n1.val == n2.val \
        and isTreeEqual(n1.left, n2.left) \
        and isTreeEqual(n1.right, n2.right) \
        and isTreeEqual(n1.next, n2.next)
