package com.hazza.leetcode.linkedlist;

import com.hazza.leetcode.linkedlist.No82RemoveDuplicatesFromSortedListII;
import com.hazza.leetcode.datastructure.ListNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-05
 * Time: 9:34 AM
 */
public class No82Test {
    No82RemoveDuplicatesFromSortedListII test;



    @Before
    public void setUp() {
        test = new No82RemoveDuplicatesFromSortedListII();
    }

    @Test
    public void testLong() {
        ListNode nodes = ListNode.getListNode(1, 2, 3, 3, 4, 4, 5);
        ListNode right = ListNode.getListNode(1, 2, 5);
        assertEquals(ListNode.outPutNodes(right), ListNode.outPutNodes(test.deleteDuplicates(nodes)));
    }

    @Test
    public void testShort() {
        ListNode nodes = ListNode.getListNode(1, 1, 1, 2, 3);
        ListNode right = ListNode.getListNode(2, 3);
        assertEquals(ListNode.outPutNodes(right), ListNode.outPutNodes(test.deleteDuplicates(nodes)));
    }
}
