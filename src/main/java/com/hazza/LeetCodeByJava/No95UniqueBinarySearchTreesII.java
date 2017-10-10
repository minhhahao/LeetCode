package com.hazza.LeetCodeByJava;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/unique-binary-search-trees-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-10
 * Time: 9:52 AM
 */
public class No95UniqueBinarySearchTreesII {

    // solution 1
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return genTreesRec(1, n);
    }

    private List<TreeNode> genTreesRec(int start, int end) {
        List<TreeNode> nodes = new ArrayList<>();
        if (start > end) {
            nodes.add(null);
            return nodes;
        }
        if (start == end) {
            nodes.add(new TreeNode(start));
            return nodes;
        }

        List<TreeNode> left, right;
        for (int i = start; i <= end; i++) {
            left = genTreesRec(start, i - 1);
            right = genTreesRec(i + 1, end);
            for (TreeNode leftNode: left) {
                for (TreeNode rightNode: right) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    nodes.add(root);
                }
            }
        }

        return nodes;
    }

    // solution 2
    public List<TreeNode> generateTrees1(int n) {
        if (n == 0) return new ArrayList<>();
        List<TreeNode>[] res = new List[n + 1];

        res[0] = new ArrayList<>();
        res[0].add(null);
        for (int len = 1; len <= n; len++) {
            res[len] = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                for (TreeNode leftNode: res[j]) {
                    for (TreeNode rightNode: res[len - j - 1]) {
                        TreeNode root = new TreeNode(j + 1);
                        root.left = leftNode;
                        root.right = clone(rightNode, j + 1);
                        res[len].add(root);
                    }
                }
            }
        }

        return res[n];
    }

    private TreeNode clone(TreeNode nd, int offset) {
        if (nd == null) return null;
        TreeNode node = new TreeNode(nd.val + offset);
        node.left = clone(nd.left, offset);
        node.right = clone(nd.right, offset);

        return node;
    }
}
