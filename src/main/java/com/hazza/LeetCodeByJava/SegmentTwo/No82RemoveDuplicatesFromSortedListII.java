package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-05
 * Time: 9:18 AM
 */
public class No82RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        while (prev.next != null) {
            ListNode cur = prev.next;
            boolean duplicate = false;
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                duplicate = true;
            }
            if (duplicate) prev.next = cur.next;
            else prev = prev.next;
        }

        return temp.next;
    }
}
