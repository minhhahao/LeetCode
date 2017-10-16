package com.hazza.LeetCodeByJava.SegmentOne;

import com.hazza.LeetCodeByJava.datastructure.ListNode;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/#/description
 */
public class No25ReverseNodesInKGroup {
    //solution 1
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 0) return head;
        ListNode curr = head;
        int count = 0;
        for (; curr != null && count != k; ++count) curr = curr.next;   //循环到k+1个结点

        if (count == k) {   //保证k+1个结点存在，来保证存在k个结点可供reverse
            curr = reverseKGroup(curr, k);  //递归
            while (count-- > 0) {   //开始逆置
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }
            head = curr;
        }

        return head;
    }

    //solution 2
    public ListNode reverseKGroup2(ListNode head, int k) {
        if (head == null || k <= 0) return head;
        int n = 0;
        for (ListNode i = head; i != null; n++) i = i.next; //计算出结点总个数

        ListNode first = new ListNode(0);
        first.next = head;
        for(ListNode prev = first, tail = head; n >= k; n -= k) {   //递减，将k个结点分组
            for (int i = 1; i < k; i++) {   //每次将下一个结点插到prev后面
                ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
            }

            prev = tail;
            tail = tail.next;
        }
        return first.next;
    }
}
