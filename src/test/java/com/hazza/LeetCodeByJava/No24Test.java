package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hazza on 7/11/17.
 */
public class No24Test {

    @Test
    public void testEmpty() {
        No24SwapNodesInPairs test = new No24SwapNodesInPairs();
        ListNode node = ListNode.getListNode(1);

        assertEquals(null, test.swapPairs(null));
        assertEquals(node, test.swapPairs(node));
    }

    @Test
    public void testExchangeTwoNodes() {
        No24SwapNodesInPairs test = new No24SwapNodesInPairs();
        ListNode node = ListNode.getListNode(1, 2);
        String res = "2 1 ";
        String temp = ListNode.outPutNodes(test.swapPairs(node));
        assertEquals(res, temp);
    }

    @Test
    public void testExchangeOddNodes() {
        No24SwapNodesInPairs test = new No24SwapNodesInPairs();
        ListNode node = ListNode.getListNode(1, 3, 9, 8, 0, 6, 7);
        String res = "3 1 8 9 6 0 7 ";
        String temp = ListNode.outPutNodes(test.swapPairs(node));
        assertEquals(res, temp);
    }

    @Test
    public void testExchangeEvenNodes() {
        No24SwapNodesInPairs test = new No24SwapNodesInPairs();
        ListNode node = ListNode.getListNode(1, 3, 9, 8, 0, 6);
        String res = "3 1 8 9 6 0 ";
        String temp = ListNode.outPutNodes(test.swapPairs(node));
        assertEquals(res, temp);
    }
}
