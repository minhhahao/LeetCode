package com.hazza.LeetCodeByJava.SegmentThree;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * Description: https://leetcode.com/problems/symmetric-tree/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 17-11-22
 * Time: 6:14 PM
 */
public class No101SymmetricTree {

    // Solution 1
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode leftPart, TreeNode rightPart) {
        int nu = (leftPart == null ? 0 : 1) + (rightPart == null ? 0 : 1);
        if (nu == 1) return false;
        if (nu == 0) return true;

        return leftPart.val == rightPart.val &&
                isSame(leftPart.left, rightPart.right) &&
                isSame(leftPart.right, rightPart.left);
    }

    // Solution 2
    public boolean isSymmetric1(TreeNode root) {
        if(root==null)  return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode left, right;
        if(root.left!=null){
            if(root.right==null) return false;
            stack.push(root.left);
            stack.push(root.right);
        } else if(root.right!=null) return false;

        while(!stack.empty()){
            if(stack.size()%2!=0) return false;
            right = stack.pop();
            left = stack.pop();
            if(right.val!=left.val) return false;

            if(left.left!=null){
                if(right.right==null) return false;
                stack.push(left.left);
                stack.push(right.right);
            } else if(right.right!=null) return false;


            if(left.right!=null){
                if(right.left==null) return false;
                stack.push(left.right);
                stack.push(right.left);
            } else if(right.left!=null) return false;
        }

        return true;
    }
}
