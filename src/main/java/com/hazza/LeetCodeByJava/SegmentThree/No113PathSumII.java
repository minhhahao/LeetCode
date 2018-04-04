package com.hazza.LeetCodeByJava.SegmentThree;

import com.hazza.LeetCodeByJava.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/path-sum-ii/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-25
 * Time: 2:35 PM
 */
public class No113PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        treeDFS(root, sum, res, new ArrayList<>());

        return res;
    }

    private void treeDFS(TreeNode node, int sum, List<List<Integer>> res, List<Integer> path) {
        if (node == null) return;
        sum -= node.val;
        path.add(node.val);
        if (node.left == null && node.right == null && sum == 0) {
            res.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        treeDFS(node.left, sum, res, path);
        treeDFS(node.right, sum, res, path);
        path.remove(path.size() - 1);
    }
}
