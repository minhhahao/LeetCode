package com.hazza.leetcode.SegmentOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations-ii/description/
 */
public class No47PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        getPermutations(nums, used, new ArrayList<>(), res);

        return res;
    }

    private void getPermutations(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // avoid the same permutations
            if (used[i] || (i > 0 && nums[i - 1] == nums[i] && !used[i - 1])) continue;
            path.add(nums[i]);
            used[i] = true;
            getPermutations(nums, used, path, res);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
