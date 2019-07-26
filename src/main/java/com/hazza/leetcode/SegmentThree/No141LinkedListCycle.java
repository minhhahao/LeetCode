package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/linked-list-cycle/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-19
 * Time: 8:44 AM
 */
public class No141LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
