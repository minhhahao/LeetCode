package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.TreeLinkNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-29
 * Time: 2:40 PM
 */
public class No117PopulatingNextRightPointersInEachNodeII {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode head = null, prev = null, cur = root;

        while (cur != null) {
            while (cur != null) {
                if (cur.left != null) {
                    if (prev != null) prev.next = cur.left;
                    else head = cur.left;
                    prev = cur.left;
                }
                if (cur.right != null) {
                    if (prev != null) prev.next = cur.right;
                    else head = cur.right;
                    prev = cur.right;
                }
                cur = cur.next;
            }
            // move to the next level
            cur = head;
            head = null;
            prev = null;
        }
    }
}
