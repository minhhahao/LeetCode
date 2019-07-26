package com.hazza.leetcode.SegmentOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/#/description
 */
public class No39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target < 0) {
            return res;
        }
        Arrays.sort(candidates);
        getCombination(candidates, 0, candidates.length, target,
                res, new ArrayList<>());

        return res;
    }

    private void getCombination(int[] candicates, int start, int end, int target,
                                List<List<Integer>> res, List<Integer> path) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(path));    //be careful!!!
            return;
        }
        for (int i = start; i < end; i++) {
            if (target < candicates[i]) break;
            path.add(candicates[i]);
            getCombination(candicates, i, end, target - candicates[i], res, path);
            path.remove(path.size() - 1);
        }
    }
}
