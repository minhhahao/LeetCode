package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/path-sum/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-24
 * Time: 1:18 PM
 */
public class No112PathSum {

    // solution 1
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) return true;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    // solution 2
    public boolean hasPathSum1(TreeNode root, int sum) {
        if (root == null) return false;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.left == null && cur.right == null && cur.val == sum)
                return true;
            if (cur.left != null) {
                cur.left.val += cur.val;
                stack.push(cur.left);
            }
            if (cur.right != null) {
                cur.right.val += cur.val;
                stack.push(cur.right);
            }
        }

        return false;
    }
}
