package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No61RotateList;
import com.hazza.leetcode.datastructure.ListNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-17
 * Time: 10:45 AM
 */
public class No61Test {
    No61RotateList test;

    private ListNode makeListNode(int... nums) {
        ListNode cur = new ListNode(nums[0]);
        ListNode head = cur;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }

    private String listNode2Str(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val + " ");
            node = node.next;
        }

        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No61RotateList();
    }

    @Test
    public void testTwo() {
        ListNode head = makeListNode(1, 2);
        ListNode right = makeListNode(2, 1);
        assertEquals(listNode2Str(right), listNode2Str(test.rotateRight(head, 1)));
    }

    @Test
    public void testFive() {
        ListNode head = makeListNode(1, 2, 3, 4, 5);
        ListNode right = makeListNode(4, 5, 1, 2, 3);
        assertEquals(listNode2Str(right), listNode2Str(test.rotateRight(head, 2)));
    }

    @Test
    public void testBigger() {
        ListNode head = makeListNode(1, 2);
        ListNode right = makeListNode(2, 1);
        assertEquals(listNode2Str(right), listNode2Str(test.rotateRight(head, 3)));
    }

}
