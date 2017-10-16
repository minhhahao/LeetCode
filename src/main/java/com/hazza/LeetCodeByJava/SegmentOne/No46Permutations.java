package com.hazza.LeetCodeByJava.SegmentOne;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/tabs/description
 */
public class No46Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        getPermutations(nums, new ArrayList<>(), res);

        return res;
    }

    private void getPermutations(int[] nums, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!path.contains(nums[i])) {
                path.add(nums[i]);
                getPermutations(nums, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

}
