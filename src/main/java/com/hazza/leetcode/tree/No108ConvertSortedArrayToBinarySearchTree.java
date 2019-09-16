package com.hazza.leetcode.tree;

import com.hazza.leetcode.datastructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-20
 * Time: 2:58 PM
 */
public class No108ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if (len == 0) return null;
        int mid = len / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, len));

        return node;
    }

    public TreeNode sortedArrayToBST1(int[] nums) {
        if (nums.length == 0) return null;
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        Deque<Integer> leftIndexStack = new ArrayDeque<>();
        Deque<Integer> rightIndexStack = new ArrayDeque<>();
        TreeNode root = new TreeNode(0);
        nodeStack.push(root);
        leftIndexStack.push(0);
        rightIndexStack.push(nums.length - 1);

        while (!nodeStack.isEmpty()) {
            TreeNode curNode = nodeStack.pop();
            int left = leftIndexStack.pop();
            int right = rightIndexStack.pop();
            int mid = left + (right - left) / 2;
            curNode.val = nums[mid];
            if (left < mid) {
                curNode.left = new TreeNode(0);
                nodeStack.push(curNode.left);
                leftIndexStack.push(left);
                rightIndexStack.push(mid - 1);
            }
            if (right > mid) {
                curNode.right = new TreeNode(0);
                nodeStack.push(curNode.right);
                leftIndexStack.push(mid + 1);
                rightIndexStack.push(right);
            }
        }

        return root;
    }
}
