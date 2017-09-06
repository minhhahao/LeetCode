package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-06
 * Time: 10:31 AM
 */
public class No83RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode prev = head;
        while (prev != null && prev.next != null) {
            ListNode cur = prev.next;
            while (cur != null && prev.val == cur.val)
                cur = cur.next;
            prev.next = cur;
            prev = prev.next;
        }

        return head;
    }
}
