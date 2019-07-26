package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-16
 * Time: 3:16 PM
 */
public class No104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
