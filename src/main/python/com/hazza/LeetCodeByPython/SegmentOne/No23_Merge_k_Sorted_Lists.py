#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/19 20:52
# https://leetcode.com/problems/merge-k-sorted-lists/
from heapq import heapify, heappop, heapreplace
from typing import List

from src.main.python.com.hazza.LeetCodeByPython.data_structure.ListNode import ListNode, makeListNode, printListNode


class Solution:
    # solution 1
    def mergeKLists1(self, lists: List[ListNode]) -> ListNode:
        def mergeTwoLists(l1, l2):
            if not l1:
                return l2
            if not l2:
                return l1

            if l1.val < l2.val:
                l1.next = mergeTwoLists(l1.next, l2)
                return l1
            else:
                l2.next = mergeTwoLists(l1, l2.next)
                return l2

        if not lists:
            return None
        listsLen = len(lists)
        if listsLen == 1:
            return lists[0]
        if listsLen == 2:
            return mergeTwoLists(lists[0], lists[1])

        return mergeTwoLists(self.mergeKLists1(lists[:int(listsLen / 2)]), self.mergeKLists1(lists[int(listsLen / 2):]))

    # solution 2
    def mergeKLists2(self, lists: List[ListNode]) -> ListNode:
        res = cur = ListNode(0)
        heap = [(node.val, idx, node) for idx, node in enumerate(lists) if node]
        heapify(heap)

        while len(heap) > 0:
            v, idx, node = heap[0]
            if not node.next:
                heappop(heap)
            else:
                heapreplace(heap, (node.next.val, idx, node.next))
            cur.next = node
            cur = cur.next

        return res.next


if __name__ == '__main__':
    solution = Solution()

    lists = [makeListNode([1, 4, 5]), makeListNode([1, 3, 4]), makeListNode([2, 6])]
    res = solution.mergeKLists1(lists)
    printListNode(res)
    print()
    lists = [makeListNode([1, 4, 5]), makeListNode([1, 3, 4]), makeListNode([2, 6])]
    res = solution.mergeKLists2(lists)
    printListNode(res)