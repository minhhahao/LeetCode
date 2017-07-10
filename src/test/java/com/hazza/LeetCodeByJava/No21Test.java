package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hazza on 7/7/17.
 */
public class No21Test {


    @Test
    public void testBothEmpty() {
        No21MergeTwoSortedLists test = new No21MergeTwoSortedLists();
        assertEquals(null, test.mergeTwoLists(null, null));
    }

    @Test
    public void testOneEmpty() {
        No21MergeTwoSortedLists test = new No21MergeTwoSortedLists();
        ListNode node = new ListNode(0);
        assertEquals(node, test.mergeTwoLists(null, node));
    }

    @Test
    public void testCombine() {
        No21MergeTwoSortedLists test = new No21MergeTwoSortedLists();
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        assertEquals(ListNode.outPutNodes(node), ListNode.outPutNodes(test.mergeTwoLists(node1, node2)));
    }
}
