package com.hazza.LeetCodeByJava.SegmentThree;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-18
 * Time: 2:33 PM
 */
public class No106ConstructBinaryTreeFromInorderAndPostorderTraversal {
    // solution 1
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int last = postorder.length - 1;
        TreeNode node = null;
        if (last >= 0) {
            node = new TreeNode(postorder[last]);
            int i = -1;
            while (postorder[last] != inorder[++i]);
            node.left = buildTree(Arrays.copyOfRange(inorder, 0, i),
                    Arrays.copyOfRange(postorder, 0, i));
            node.right = buildTree(Arrays.copyOfRange(inorder, i + 1, inorder.length),
                    Arrays.copyOfRange(postorder, i, last));
        }

        return node;
    }

    // solution 2
    public TreeNode buildTree1(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) return null;
        int len = postorder.length;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev = null;
        TreeNode root = new TreeNode(postorder[len - 1]);
        stack.push(root);

        for (int i = len - 2, j = len - 1; i >= 0; --i) {
            while (!stack.isEmpty() && stack.peek().val == inorder[j]) {
                prev = stack.pop();
                j--;
            }
            TreeNode newNode = new TreeNode(postorder[i]);
            if (prev != null) {
                prev.left = newNode;
            } else if (!stack.isEmpty()) {
                TreeNode currTop = stack.peek();
                currTop.right = newNode;
            }
            stack.push(newNode);
            prev = null;
        }

        return root;
    }
}
