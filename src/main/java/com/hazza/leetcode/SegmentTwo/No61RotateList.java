package com.hazza.leetcode.SegmentTwo;

import com.hazza.leetcode.datastructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/rotate-list/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-17
 * Time: 10:35 AM
 */
public class No61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (k < 1 || head == null) return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode cur = temp, tail = temp;
        int count = 0;
        while (tail.next != null) {
            tail = tail.next;
            ++count;
        }
        for (int i = count - k % count; i > 0; i--)
            cur = cur.next;
        tail.next = temp.next;
        temp.next = cur.next;
        cur.next = null;

        return temp.next;
    }
}
