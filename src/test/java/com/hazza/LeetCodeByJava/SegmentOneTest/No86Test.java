package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No86PartitionList;
import com.hazza.LeetCodeByJava.datastructure.ListNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-23
 * Time: 2:42 PM
 */
public class No86Test {
    No86PartitionList test;

    @Before
    public void setUp() {
        test = new No86PartitionList();
    }

    @Test
    public void testNonExisted() {
        ListNode head = ListNode.getListNode(1);
        ListNode right = ListNode.getListNode(1);
        assertEquals(ListNode.outPutNodes(right), ListNode.outPutNodes(test.partition(head, 2)));
    }


    @Test
    public void testExisted() {
        ListNode head = ListNode.getListNode(1, 4, 3, 2, 5, 2);
        ListNode right = ListNode.getListNode(1, 2, 2, 4, 3, 5);
        assertEquals(ListNode.outPutNodes(right), ListNode.outPutNodes(test.partition(head, 3)));
    }

}
