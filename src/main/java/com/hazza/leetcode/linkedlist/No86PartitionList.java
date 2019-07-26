package com.hazza.leetcode.linkedlist;

import com.hazza.leetcode.datastructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/partition-list/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-23
 * Time: 2:39 PM
 */
public class No86PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode start = new ListNode(0), bigStart = new ListNode(0);
        ListNode smallPart = start, bigPart = bigStart;
        start.next = smallPart;
        bigStart.next = bigPart;
        while (head != null) {
            if (head.val < x) smallPart = smallPart.next = head;
            else bigPart = bigPart.next = head;
            head = head.next;
        }
        bigPart.next = null;
        smallPart.next = bigStart.next;

        return start.next;
    }
}
