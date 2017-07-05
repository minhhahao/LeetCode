package com.hazza.LeetCodeByJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/4sum/#/description
 */
public class No18FourSum {
    //solution 1
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 4) return res;
        Arrays.sort(nums);

        for (int first = 0; first < len - 3; ++first) {
            if (first > 0 && nums[first] == nums[first - 1]) continue;
            for (int second = first + 1; second < len - 2; ++second) {
                if (second > first + 1 && nums[second] == nums[second - 1]) continue;
                int left = second + 1, right = nums.length - 1;
                int tg = target - nums[first] - nums[second];
                while (left < right) {
                    if (tg == nums[left] + nums[right]) {
                        res.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                        while (left + 1 <= right && nums[left] == nums[left + 1]) ++left;
                        while (right - 1 >= left && nums[right] == nums[right - 1]) --right;
                        ++left;
                    }
                    else if (tg < nums[left] + nums[right]) --right;
                    else ++left;
                }
            }
        }
        return res;
    }

    //solution 2
    private List<List<Integer>> fourSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;

        if (nums == null || len < 4) return res;
        Arrays.sort(nums);
        if (nums[0] * 4 > target || nums[len - 1] * 4 < target) return res;

        for (int i = 0; i < len - 3; i++) {
            int first = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) continue;  //avoid duplicates
            if (first + 3 * nums[len - 1] < target) continue;   //first is too small
            if (first * 4 > target) break;  //first is too big
            if (first * 4 == target && first == nums[i + 3]) {
                res.add(Arrays.asList(first, first, first, first));
                break;
            }
            threeSumForFourSum(res, nums, target - first, i + 1, len - 1, first);
        }

        return res;
    }

    private void threeSumForFourSum(List<List<Integer>> res, int[] nums, int target, int left, int right, int first) {
        if (left + 1 >= right) return;
        if (nums[left] * 3 > target || nums[right] * 3 < target) return;

        for (int i = left; i <= right - 2; i++) {
            int second = nums[i];
            if (i > left && nums[i] == nums[i - 1]) continue;
            if (second + 2 * nums[right] < target) continue;
            if (second * 3 > target) break;
            if (second * 3 == target && second == nums[i + 2]) {
                res.add(Arrays.asList(first, second, second, second));
                break;
            }
            twoSumForFourSum(res, nums, target - second, i + 1, right, first, second);
        }
    }

    public void twoSumForFourSum(List<List<Integer>> res, int[] nums, int target, int left, int right, int first, int second) {
        if (left >= right) return;
        if (nums[left] * 2 > target || nums[right] * 2 < target) return;

        int lo = left, hi = right;
        while (lo < hi) {
            if (lo > left && nums[lo] == nums[lo - 1]) {
                ++lo;
                continue;
            }
            if (hi < right && nums[hi] == nums[hi + 1]) {
                --hi;
                continue;
            }
            if (nums[lo] + nums[hi] == target) {
                res.add(Arrays.asList(first, second, nums[lo], nums[hi]));
                ++lo;
                --hi;
            }
            else if (nums[lo] + nums[hi] < target) ++lo;
            else --hi;
        }
    }

}
