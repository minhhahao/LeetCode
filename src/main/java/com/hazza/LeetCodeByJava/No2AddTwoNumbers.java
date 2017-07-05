package com.hazza.LeetCodeByJava;

/**
 * https://leetcode.com/problems/add-two-numbers/#/description
 */
public class No2AddTwoNumbers {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        int sum = 0;

        while(l1 != null || l2 != null) {
            sum /= 10;  //上一次循环留下的sum值
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        if (sum / 10 == 1) {
            tmp.next = new ListNode(1);
        }
        return res.next;
    }
}
