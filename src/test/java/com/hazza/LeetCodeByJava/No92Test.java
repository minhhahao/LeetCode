package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-29
 * Time: 1:01 PM
 */
public class No92Test {
    No92ReverseLinkedListII test;

    @Before
    public void setUp() {
        test = new No92ReverseLinkedListII();
    }

    @Test
    public void testTwo() {
        ListNode head = ListNode.getListNode(1, 2);
        ListNode right = ListNode.getListNode(2, 1);

        assertEquals(ListNode.outPutNodes(right),
                ListNode.outPutNodes(test.reverseBetween(head, 1, 2)));
    }

    @Test
    public void testLong() {
        ListNode head = ListNode.getListNode(1, 2, 3, 4, 5, 6, 7, 8);
        ListNode right = ListNode.getListNode(1, 2, 6, 5, 4, 3, 7, 8);

        assertEquals(ListNode.outPutNodes(right),
                ListNode.outPutNodes(test.reverseBetween(head, 3, 6)));
    }
}
