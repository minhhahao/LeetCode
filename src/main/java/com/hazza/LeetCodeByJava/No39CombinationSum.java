package com.hazza.LeetCodeByJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/#/description
 */
public class No39CombinationSum {
    //solution 1
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
        else if (target == 0) res.add(new ArrayList<>(path));    //be careful!!!
        else {
            for (int i = start; i < end; i++) {
                path.add(candicates[i]);
                getCombination(candicates, i, end, target - candicates[i], res, path);
                path.remove(path.size() - 1);
            }
        }
    }


}
