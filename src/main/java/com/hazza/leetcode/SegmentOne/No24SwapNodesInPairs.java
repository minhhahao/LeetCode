package com.hazza.leetcode.SegmentOne;

import com.hazza.leetcode.datastructure.ListNode;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/#/description
 */
public class No24SwapNodesInPairs {
    //solution 1
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        temp.next = head;
        while (temp.next != null && temp.next.next != null) {
            ListNode swapLeft = temp.next;
            ListNode swapRight = temp.next.next;
            swapLeft.next = swapRight.next;
            swapRight.next = swapLeft;
            temp.next = swapRight;
            temp = swapLeft;
        }

        return res.next;
    }

    //solution 2
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode swap = head.next;
        head.next = swapPairs2(head.next.next);
        swap.next = head;

        return swap;
    }
}
