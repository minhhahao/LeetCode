package com.hazza.leetcode.linkedlist;

import com.hazza.leetcode.linkedlist.No83RemoveDuplicatesFromSortedList;
import com.hazza.leetcode.datastructure.ListNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-06
 * Time: 10:44 AM
 */
public class No83Test {
    No83RemoveDuplicatesFromSortedList test;

    @Before
    public void setUp() {
        test = new No83RemoveDuplicatesFromSortedList();
    }

    @Test
    public void testShort() {
        ListNode head = ListNode.getListNode(1, 1, 2);
        ListNode right = ListNode.getListNode(1, 2);
        assertEquals(ListNode.outPutNodes(right), ListNode.outPutNodes(test.deleteDuplicates(head)));
    }

    @Test
    public void testLong() {
        ListNode head = ListNode.getListNode(1, 1, 2, 3, 3);
        ListNode right = ListNode.getListNode(1, 2, 3);
        assertEquals(ListNode.outPutNodes(right), ListNode.outPutNodes(test.deleteDuplicates(head)));
    }

    @Test
    public void testZero() {
        ListNode head = ListNode.getListNode(0, 0, 0, 0, 0);
        ListNode right = ListNode.getListNode(0);
        assertEquals(ListNode.outPutNodes(right), ListNode.outPutNodes(test.deleteDuplicates(head)));
    }
}
