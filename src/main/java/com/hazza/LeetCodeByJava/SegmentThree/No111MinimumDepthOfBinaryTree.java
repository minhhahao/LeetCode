package com.hazza.LeetCodeByJava.SegmentThree;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-23
 * Time: 2:11 PM
 */
public class No111MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        return (leftDepth == 0 || rightDepth == 0) ? leftDepth + rightDepth + 1: Math.min(leftDepth,rightDepth) + 1;
    }

}
