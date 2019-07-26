package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-7
 * Time: 1:29 PM
 */
public class No124BinaryTreeMaximumPathSum {
    int max;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        max = Integer.MIN_VALUE;
        treeDFS(root);
        return max;
    }

    private int treeDFS(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, treeDFS(node.left));
        int right = Math.max(0, treeDFS(node.right));
        max = Math.max(max, left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}
