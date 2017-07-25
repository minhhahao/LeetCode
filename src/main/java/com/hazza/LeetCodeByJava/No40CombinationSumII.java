package com.hazza.LeetCodeByJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-ii/#/description
 */
public class No40CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target <= 0) return res;
        Arrays.sort(candidates);
        getConmbination(candidates, 0, candidates.length, target, res, new ArrayList<>());

        return res;
    }

    private void getConmbination(int[] candidates, int start, int end, int target,
                                 List<List<Integer>> res, List<Integer> path) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < end; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (target < candidates[i]) break;
            path.add(candidates[i]);
            getConmbination(candidates, i + 1, end, target - candidates[i], res, path);
            path.remove(path.size() - 1);
        }
    }
}
