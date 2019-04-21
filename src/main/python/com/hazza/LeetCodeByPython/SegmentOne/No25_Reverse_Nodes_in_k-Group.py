#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/21 20:01
# https://leetcode.com/problems/reverse-nodes-in-k-group/
from src.main.python.com.hazza.LeetCodeByPython.dataStructure.ListNode import ListNode, makeListNode, printListNode


class Solution:
    # solution 1, recursively
    def reverseKGroup1(self, head: ListNode, k: int) -> ListNode:
        if not head:
            return None

        cur = head
        cnt = 0
        while cur and cnt < k:
            cnt += 1
            cur = cur.next

        if cnt == k:
            cur = self.reverseKGroup1(cur, k)
            for _ in range(k):
                head.next, head, cur = cur, head.next, head
            head = cur

        return head

    # solution 2, iteratively
    def reverseKGroup2(self, head: ListNode, k: int) -> ListNode:
        res = split = ListNode(0)
        res.next = l = r = head

        while True:
            cnt = 0
            while r and cnt < k:
                cnt += 1
                r = r.next
            if cnt == k:
                pre, cur = r, l
                for _ in range(k):
                    cur.next, cur, pre = pre, cur.next, cur
                split.next, split, l = pre, l, r
            else:
                return res.next


if __name__ == '__main__':
    solution = Solution()

    listnode = makeListNode([1, 2, 3, 4, 5])
    printListNode(solution.reverseKGroup1(listnode, 2))
    print()
    listnode = makeListNode([1, 2, 3, 4, 5])
    printListNode(solution.reverseKGroup1(listnode, 3))

    listnode = makeListNode([1, 2, 3, 4, 5])
    printListNode(solution.reverseKGroup2(listnode, 2))
    print()
    listnode = makeListNode([1, 2, 3, 4, 5])
    printListNode(solution.reverseKGroup2(listnode, 3))
