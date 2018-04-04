package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/recover-binary-search-tree/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-19
 * Time: 6:53 PM
 */
public class No99RecoverBinarySearchTree {
    private TreeNode firstNode = null, secondNode = null, prevNode = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        if (root == null) return;
        traverse(root);
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        if (firstNode == null && prevNode.val >= root.val) firstNode = prevNode;
        if (firstNode != null && prevNode.val >= root.val) secondNode = root;
        prevNode = root;
        traverse(root.right);
    }
}
