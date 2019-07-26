package com.hazza.leetcode.SegmentOne;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/#/description
 */
public class No1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
