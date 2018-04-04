package com.hazza.LeetCodeByJava.SegmentThree;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-15
 * Time: 4:34 PM
 */
public class No103BinaryTreeZigzagLevelOrderTraversal {

    // solution 1
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        stack.add(root);
        boolean leftToRight = true;
        while (!stack.isEmpty()) {
            Stack<TreeNode> level = (Stack<TreeNode>)stack.clone();
            stack.clear();
            List<Integer> temp = new ArrayList<>();
            while (! level.isEmpty()) {
                TreeNode node = level.pop();
                temp.add(node.val);
                if (leftToRight) {
                    if (node.left != null) stack.add(node.left);
                    if (node.right != null) stack.add(node.right);
                } else {
                    if (node.right != null) stack.add(node.right);
                    if (node.left != null) stack.add(node.left);
                }
            }
            leftToRight = !leftToRight;
            res.add(temp);
        }

        return res;
    }

    // solution 2
    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,0, res);

        return res;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> res) {
        if (node == null) return;
        if (res.size() <= level) {
            List<Integer> newLevel = new ArrayList<>();
            res.add(newLevel);
        }
        List<Integer> list = res.get(level);
        if (level % 2 == 0) list.add(node.val);
        else list.add(0, node.val);

        dfs(node.left, level + 1, res);
        dfs(node.right, level + 1, res);
    }


}
