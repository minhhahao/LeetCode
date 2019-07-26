package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.TreeNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-17
 * Time: 1:19 PM
 */
public class No105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        TreeNode node = null;
        if (len > 0) {
            node = new TreeNode(preorder[0]);
            int i = -1;
            while (preorder[0] != inorder[++i]);
            node.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1),
                    Arrays.copyOfRange(inorder, 0, i));
            node.right = buildTree(Arrays.copyOfRange(preorder, i + 1, len),
                    Arrays.copyOfRange(inorder, i + 1, inorder.length));
        }

        return node;
    }

    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if (len == 0 || inorder.length != len) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]), cur = root;


        for (int i = 1, j = 0; i < len; i++) {
            if (cur.val != preorder[j]) { // find the deepest left child node
                cur.left = new TreeNode(preorder[i]);
                stack.push(cur);
                cur = cur.left;
            } else {
                ++j;
                while (!stack.empty() && stack.peek().val == inorder[j]) {
                    cur = stack.pop();
                    ++j;
                }
                cur = cur.right = new TreeNode(preorder[i]);
            }
        }

        return root;
    }
}
