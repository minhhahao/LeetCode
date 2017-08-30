package com.hazza.LeetCodeByJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/combinations/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-30
 * Time: 7:26 PM
 */
public class No77Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<>(), res, k, n, 1);
        return res;
    }

    private void dfs(List<Integer> path, List<List<Integer>> res, int k, int n, int start) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            dfs(path, res, k, n, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
