package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-3
 * Time: 7:38 PM
 */
public class No129SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;

        return treeDFS(root, 0);
    }

    private int treeDFS(TreeNode node, int sum) {
        if (node == null) return 0;

        if (node.left == null && node.right == null) return sum * 10 + node.val;

        return treeDFS(node.left, sum * 10 + node.val) + treeDFS(node.right, sum * 10 + node.val);
    }
}
