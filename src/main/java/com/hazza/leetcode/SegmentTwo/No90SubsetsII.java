package com.hazza.leetcode.SegmentTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/subsets-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-27
 * Time: 10:36 AM
 */
public class No90SubsetsII {
    // solution 1
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(new ArrayList<>(), res, nums, 0);
        return res;
    }

    private void backtracking(List<Integer> path, List<List<Integer>> res, int[] nums, int start) {
        res.add(new ArrayList<>(path));
        int len = nums.length;
        for (int i = start; i < len; i++) {
            if (i == start || nums[i] != nums[i - 1]) {
                path.add(nums[i]);
                backtracking(path, res, nums, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    // solution 2
    public List<List<Integer>> subsetsWithDup1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Arrays.sort(nums);
        int size = 0, startIndex = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            startIndex = ((i > 0 && nums[i] == nums[i - 1]) ? size : 0);
            size = res.size();
            for (int j = startIndex; j < size; j++) {
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);
            }
        }

        return res;
    }

}
