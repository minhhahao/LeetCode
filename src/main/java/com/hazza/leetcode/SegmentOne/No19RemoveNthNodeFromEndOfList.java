package com.hazza.leetcode.SegmentOne;

import com.hazza.leetcode.datastructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/#/description
 */

public class No19RemoveNthNodeFromEndOfList {
    //solution 1
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            nodes.add(temp);
            ++len;
            temp = temp.next;
        }
        if (n > len) return head;
        if (n == len) {
            temp = head.next;
            head = null;
            return temp;
        } else {
            ListNode deletedNode = nodes.get(len - n);
            temp = nodes.get(len - n - 1);
            temp.next = deletedNode.next;
            deletedNode = null;
            return head;
        }
    }

    //solution 2
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode fast = start, slow = start;
        slow.next = head;

        //move fast in front slow so that the gap between slow and fast becomes n
        for (int i = 0; i <= n; ++i) fast = fast.next;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode deletedNode = slow.next;
        slow.next = deletedNode.next;
        deletedNode = null;
        return start.next;
    }

}

