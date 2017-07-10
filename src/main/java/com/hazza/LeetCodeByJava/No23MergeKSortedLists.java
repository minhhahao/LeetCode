package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/#/description
 */
public class No23MergeKSortedLists {
    //solution 1
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        Queue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode listNode1, ListNode listNode2) {
                if (listNode1.val < listNode2.val) return -1;
                else if (listNode1.val == listNode2.val) return 0;
                else return 1;
            }
        });

        for (ListNode listNode: lists) {
            if (listNode != null) queue.add(listNode);
        }

        ListNode start = new ListNode(0);
        ListNode current = start;
        while (!queue.isEmpty()) {
            current.next = queue.poll();
            current = current.next;
            if (current.next != null) queue.add(current.next);
        }

        return start.next;
    }

    //solution 2
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head;
        if (l1.val < l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }

        return head;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        if (lists.length == 2) return mergeTwoLists(lists[0], lists[1]);

        return mergeTwoLists(mergeKLists2(Arrays.copyOfRange(lists, 0, lists.length / 2))
                ,mergeKLists2(Arrays.copyOfRange(lists, lists.length / 2, lists.length)));
    }
}
