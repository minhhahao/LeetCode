package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-26
 * Time: 2:06 PM
 */
public class No114FlattenBinaryTreeToLinkedList {

    // solution 1
    public void flatten(TreeNode root) {
        flatten(root, null);
    }

    private TreeNode flatten(TreeNode node, TreeNode prev) {
        if (node == null) return null;
        prev = flatten(node.right, prev);
        prev = flatten(node.left, prev);
        node.right = prev;
        node.left = null;

        return node;
    }

    // solution 2
    public void flatten1(TreeNode root) {
        if (root == null) return;
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode prev = cur.left;
                // find the previous node
                while (prev.right != null) prev = prev.right;
                prev.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }

    // solution 3
    public void flatten2(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.right != null) stack.push(cur.right);
            if (cur.left != null) stack.push(cur.left);
            if (!stack.isEmpty()) cur.right = stack.peek();
            cur.left = null;
        }
    }
}
