package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/subsets/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-31
 * Time: 9:47 AM
 */
public class No78Subsets {

    // solution 1
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(new ArrayList<>(), res, nums, 0);
        return res;
    }

    private void backtracking(List<Integer> path, List<List<Integer>> res, int[] nums, int start) {
        res.add(new ArrayList<>(path));
        int len = nums.length;
        for (int i = start; i < len; i++) {
            path.add(nums[i]);
            backtracking(path, res, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    // solution 2
    public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Arrays.sort(nums);
        for (int i: nums) {
            List<List<Integer>> tempRes = new ArrayList<>();
            for (List<Integer> sub: res) {
                List<Integer> temp = new ArrayList<>(sub);
                temp.add(i);
                tempRes.add(temp);
            }
            res.addAll(tempRes);
        }

        return res;
    }

    // solution 3
    public List<List<Integer>> subsets2(int[] nums) {
        int numsLen = nums.length;
        int subsetLen = 1 << numsLen;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>(subsetLen);
        for (int i = 0; i < subsetLen; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < numsLen; j++) {
                if (((i >> j) & 1) != 0)
                    temp.add(nums[j]);
            }
            res.add(temp);
        }

        return res;
    }
}
