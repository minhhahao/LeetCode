package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * Description: https://leetcode.com/problems/same-tree/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 17-11-14
 * Time: 10:29 AM
 */
public class No100SameTree {
    // solution1
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null && p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }

    // solution2
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();
        if (p != null) stackP.push(p);
        if (q != null) stackQ.push(q);
        while (!stackP.isEmpty() && !stackQ.isEmpty()) {
            TreeNode tempP = stackP.pop();
            TreeNode tempQ = stackQ.pop();
            if (tempP.val != tempQ.val) return false;
            if (tempP.right != null) stackP.push(tempP.right);
            if (tempQ.right != null) stackQ.push(tempQ.right);
            if (stackP.size() != stackQ.size()) return false;
            if (tempP.left != null) stackP.push(tempP.left);
            if (tempQ.left != null) stackQ.push(tempQ.left);
            if (stackP.size() != stackQ.size()) return false;
        }

        return stackP.size() == stackQ.size();
    }
}
