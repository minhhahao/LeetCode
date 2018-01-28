package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.TreeLinkNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-28
 * Time: 8:30 PM
 */
public class No116PopulatingNextRightPointersInEachNode {

    // solution 1
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> queue = new ArrayDeque<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeLinkNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
                if (i == len - 1) node.next = null;
                else node.next = queue.peek();
            }
        }
    }

    // solution 2
    public void connect1(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode prev = root;
        TreeLinkNode cur = null;
        while (prev.left != null) {
            cur = prev;
            while (cur != null) {
                cur.left.next = cur.right;
                if (cur.next != null) cur.right.next = cur.next.left;
                cur = cur.next;
            }
            prev = prev.left;
        }
    }

    // solution 3
    public void connect2(TreeLinkNode root) {
        if (root == null) return;

        if (root.left != null) {
            root.left.next = root.right;
            if (root.next != null) root.right.next = root.next.left;
        }

        connect2(root.left);
        connect2(root.right);
    }
}
