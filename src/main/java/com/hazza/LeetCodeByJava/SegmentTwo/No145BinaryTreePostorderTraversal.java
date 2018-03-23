package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-23
 * Time: 8:36 AM
 */
public class No145BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                res.addFirst(node.val); // reverse the pre order
                node = node.right;
            } else {
                node = stack.pop();
                node = node.left;
            }
        }

        return res;
    }

}
