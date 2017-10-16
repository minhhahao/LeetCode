package com.hazza.LeetCodeByJava.SegmentOne;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.Stack;

/**
 * Created with longelliJ IDEA.
 * Description: https://leetcode.com/problems/validate-binary-search-tree/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-16
 * Time: 9:12 AM
 */
public class No98ValidateBinarySearchTree {
    // solution 1
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean dfs(TreeNode node, long maxVal, long minVal) {
        if (node == null) return true;
        if (node.val >= maxVal || node.val <= minVal) return false;
        return dfs(node.left, node.val, minVal) && dfs(node.right, maxVal, node.val);
    }

    // solution 2
    public boolean isValidBST1(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null, node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            if (pre != null && node.val <= pre.val) return false;
            pre = node;
            node = node.right;
        }

        return true;
    }
}
