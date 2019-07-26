package com.hazza.leetcode.datastructure;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-09
 * Time: 9:02 AM
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static TreeNode createBinTree(int[] preOrder, int[] inOrder) {
        int num = preOrder.length;
        TreeNode node = null;
        if (num > 0) {
            node = new TreeNode(preOrder[0]);
            int i = 0;
            while (inOrder[i] != preOrder[0]) ++i;
            node.left = createBinTree(Arrays.copyOfRange(preOrder, 1, i + 1),
                    Arrays.copyOfRange(inOrder, 0, i));
            node.right = createBinTree(Arrays.copyOfRange(preOrder, i + 1, preOrder.length),
                    Arrays.copyOfRange(inOrder, i + 1, inOrder.length));
        }

        return node;
    }

    public static void printTree(TreeNode node, int level) {
        if (node != null) {
            System.out.println("level " + level + " : " + node.val);
            printTree(node.left, level + 1);
            printTree(node.right, level + 1);
        }
    }

    public static boolean treeEqual(TreeNode node1, TreeNode node2) {
        if (node1 == null ^ node2 == null) return false;
        if (node1 == null) return true;

        return (node1.val == node2.val) && (treeEqual(node1.left, node2.left) && treeEqual(node2.right, node2.right));
    }
}
