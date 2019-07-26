package com.hazza.leetcode.datastructure;


public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public static String outPutNodes(ListNode node) {
        StringBuffer temp = new StringBuffer();
        while (node != null) {
            temp.append(node.val + " ");
            node = node.next;
        }
        return temp.toString();
    }

    public static ListNode getListNode(int... datas) {
        ListNode node = new ListNode(0);
        ListNode temp = node;
        for (int i = 0; i < datas.length; i++) {
            node.next = new ListNode(datas[i]);
            node = node.next;
        }

        return temp.next;
    }
}
