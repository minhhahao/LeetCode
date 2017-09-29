package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/reverse-linked-list-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-29
 * Time: 12:30 PM
 */
public class No92ReverseLinkedListII {

    // assume 1 ≤ m ≤ n ≤ length of list
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
        ListNode start = new ListNode(0);
        start.next = head;
        int count = 0;
        ListNode prev = start;
        while (++count < m) prev = prev.next;
        ListNode cur = prev.next, right = cur.next;
        while (++count <= n) {
            ListNode temp = right.next;
            right.next = cur;
            cur = right;
            right = temp;
        }
        ListNode temp = prev.next;
        prev.next = cur;
        temp.next = right;

        return start.next;
    }
}
