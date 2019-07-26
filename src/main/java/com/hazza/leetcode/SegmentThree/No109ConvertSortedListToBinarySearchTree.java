package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.ListNode;
import com.hazza.leetcode.datastructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-21
 * Time: 8:21 PM
 */
public class No109ConvertSortedListToBinarySearchTree {

    // solution 1
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return toBST(head, null);
    }

    private TreeNode toBST(ListNode head, ListNode tail) {
        if (head == tail) return null;
        ListNode slow = head, fast = head;
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode treeNode = new TreeNode(slow.val);
        treeNode.left = toBST(head, slow);
        treeNode.right = toBST(slow.next, tail);

        return treeNode;
    }

    // solution 2
    private ListNode nodeIter;

    public TreeNode sortedListToBST1(ListNode head) {
        if (head == null) return null;
        nodeIter = head;
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            ++count;
        }

        return toBSTHepler(0, count - 1);
    }

    private TreeNode toBSTHepler(int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        // get the left child node
        TreeNode left = toBSTHepler(start, mid - 1);
        // get the parent node and move the nodeIter
        TreeNode treeNode = new TreeNode(nodeIter.val);
        treeNode.left = left;
        nodeIter = nodeIter.next;
        // get the right child node
        treeNode.right = toBSTHepler(mid + 1, end);

        return treeNode;
    }
}
