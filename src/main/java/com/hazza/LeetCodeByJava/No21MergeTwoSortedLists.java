package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;

/**
 * Created by hazza on 7/7/17.
 */
public class No21MergeTwoSortedLists {

    //solution 1
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);

        if (l1 == null && l2 == null) return null;
        else if (l2 == null) return l1;
        else if (l1 == null) return l2;

        ListNode res = temp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            } else {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            while (l1 != null) {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            }
        }
        if (l2 != null) {
            while (l2 != null) {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }

        return res.next;
    }

    //solution 2
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
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
}
