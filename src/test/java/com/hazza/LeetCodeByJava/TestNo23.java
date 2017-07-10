package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNo23 {
    @Test
    public void testEmpty() {
        No23MergeKSortedLists test = new No23MergeKSortedLists();
        ListNode[] lists = new ListNode[0];

        assertEquals(null, test.mergeKLists(null));
        assertEquals(null, test.mergeKLists(lists));
    }

    @Test
    public void testMerge() {
        No23MergeKSortedLists test = new No23MergeKSortedLists();
        ListNode[] lists = new ListNode[4];

        lists[0] = ListNode.getListNode(1, 4, 9, 13);
        lists[1] = ListNode.getListNode(3, 7, 11, 15);
        lists[2] = null;
        lists[3] = ListNode.getListNode(2, 5, 22, 34);

        String res = "1 2 3 4 5 7 9 11 13 15 22 34 ";
        String temp = ListNode.outPutNodes(test.mergeKLists(lists));

        assertEquals(res, temp);
    }

}
