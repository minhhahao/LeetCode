package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/sort-list/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-2
 * Time: 8:24 AM
 */
public class No148SortList {

    // solution 1

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }

        return l.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head, pre = null;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }

    // solution 2

    public ListNode sortList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode cur = head;

        int len = 0;
        while (cur != null) {
            ++len;
            cur = cur.next;
        }

        ListNode first = new ListNode(0);
        first.next = head;
        ListNode left, right, tail;
        for (int i = 1; i < len; i <<= 1) {
            cur = first.next;
            tail = first;
            while (cur != null) {
                left = cur;
                right = split(left, i);
                cur = split(right, i);
                tail = merge(left, right, tail);
            }
        }

        return first.next;
    }

    private static ListNode split(ListNode node, int len) {
        for (int i = 1; i < len && node != null; i++) {
            node = node.next;
        }

        if (node == null) {
            return null;
        }

        ListNode next = node.next;
        node.next = null;

        return next;
    }
    
    private static ListNode merge(ListNode l1, ListNode l2, ListNode prev) {
        ListNode cur = prev;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }

        while (cur.next != null) {
            cur = cur.next;
        }

        return cur;
    }
}
