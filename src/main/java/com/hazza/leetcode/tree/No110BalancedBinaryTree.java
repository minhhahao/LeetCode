package com.hazza.leetcode.tree;

import com.hazza.leetcode.datastructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/balanced-binary-tree/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-22
 * Time: 4:09 PM
 */
public class No110BalancedBinaryTree {

    // solution 1
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }

    // solution 2
    public boolean isBalanced1(TreeNode root) {
        return depthDFS(root) != -1;
    }

    private int depthDFS(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = depthDFS(node.left);
        if (leftDepth == -1) return -1;
        int rightDepth = depthDFS(node.right);
        if (rightDepth == -1) return -1;

        if (Math.abs(leftDepth - rightDepth) > 1) return -1;
        return Math.max(leftDepth, rightDepth) + 1;
    }

}
