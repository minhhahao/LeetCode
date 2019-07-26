package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.TreeNode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 17-11-27
 * Time: 8:38 PM
 */
public class No102BinaryTreeLevelOrderTraversal {
    // solution 1
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Stack<TreeNode> temp = new Stack<>();
            List<Integer> level = new ArrayList<>();
            while (!stack.isEmpty()) temp.add(stack.pop());
            while (!temp.isEmpty()) {
                TreeNode node = temp.pop();
                level.add(node.val);
                if (node.left != null) stack.add(node.left);
                if (node.right != null) stack.add(node.right);
            }
            res.add(level);
        }

        return res;
    }

    // solution 2
    public List<List<Integer>> levelOrder1(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(level);
        }

        return res;
    }

    // solution 3
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelHelper(res, root, 0);

        return res;
    }

    private void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) res.add(new ArrayList<>());
        res.get(height).add(root.val);
        levelHelper(res, root.left, height + 1);
        levelHelper(res, root.right, height + 1);
    }

}
