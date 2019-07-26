package com.hazza.leetcode.SegmentOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/#/description
 */
public class No15threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] > 0) break;
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) ++lo;
                        while (lo < hi && nums[hi] == nums[hi - 1]) --hi;
                        ++lo;
                        --hi;
                    } else if (nums[lo] + nums[hi] > sum) {
                        while (lo < hi && nums[hi] == nums[hi - 1]) --hi;
                        --hi;
                    } else {
                        while (lo < hi && nums[lo] == nums[lo + 1]) ++lo;
                        ++lo;
                    }
                }
            }

        }
        return res;
    }
}
