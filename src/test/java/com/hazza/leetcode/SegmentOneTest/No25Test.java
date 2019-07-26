package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No25ReverseNodesInKGroup;
import com.hazza.leetcode.datastructure.ListNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/12/17.
 */
public class No25Test {
    @Test
    public void testEmpty() {
        No25ReverseNodesInKGroup test = new No25ReverseNodesInKGroup();
        ListNode node = ListNode.getListNode(1, 2, 3, 4, 5);
        assertEquals(null, test.reverseKGroup(null, 2));
        assertEquals(node, test.reverseKGroup(node, 0));
    }

    @Test
    public void testReverse() {
        No25ReverseNodesInKGroup test = new No25ReverseNodesInKGroup();
        ListNode node = ListNode.getListNode(1, 2, 3, 4, 5);
        String res1 = "2 1 4 3 5 ";
        String temp1 = ListNode.outPutNodes(test.reverseKGroup(node, 2));
        assertEquals(res1, temp1);

        node = ListNode.getListNode(1, 2, 3, 4, 5);
        String res2 = "3 2 1 4 5 ";
        String temp2 = ListNode.outPutNodes(test.reverseKGroup(node, 3));
        assertEquals(res2, temp2);
    }

    @Test
    public void testReverseOne() {
        No25ReverseNodesInKGroup test = new No25ReverseNodesInKGroup();
        ListNode node = ListNode.getListNode(1, 2, 3, 4, 5);
        String res = "1 2 3 4 5 ";
        String temp = ListNode.outPutNodes(test.reverseKGroup(node, 1));
        assertEquals(res, temp);
    }

    @Test
    public void testReverseAll() {
        No25ReverseNodesInKGroup test = new No25ReverseNodesInKGroup();
        ListNode node = ListNode.getListNode(1, 2, 3, 4, 5);
        String res = "5 4 3 2 1 ";
        String temp = ListNode.outPutNodes(test.reverseKGroup(node, 5));
        assertEquals(res, temp);
    }

    @Test
    public void testOutOfRange() {
        No25ReverseNodesInKGroup test = new No25ReverseNodesInKGroup();
        ListNode node = ListNode.getListNode(1, 2, 3, 4, 5);
        String res = "1 2 3 4 5 ";
        String temp = ListNode.outPutNodes(test.reverseKGroup(node, 6));
        assertEquals(res, temp);
    }
}
