package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/permutation-sequence/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-16
 * Time: 9:56 AM
 */
public class No60PermutationSequence {
    // solution 1
        public String getPermutation(int n, int k) {
            if (n < 1 || k < 1) return new String();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = i + 1;
            for (int i = 1; i < k; i++) nextPermutation(nums);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) sb.append(nums[i]);

            return sb.toString();
        }

        public void nextPermutation(int[] nums) {
            if (nums == null || nums.length == 0 || nums.length == 1) return;
            int len = nums.length, i, j;
            for (i = len - 1; i > 0; i--)
                if (nums[i] > nums[i - 1]) break;
            if (i > 0) {
                for (j = len - 1; j > i - 1; j--)
                    if (nums[j] > nums[i - 1]) break;
                swap(nums, j, i -1);
            }
            reverse(nums, i, len - 1);
        }

        private void swap(int[] nums, int i, int j) {
            if (nums[i] != nums[j]) {
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[j] ^ nums[i];
                nums[i] = nums[i] ^ nums[j];
            }
        }

        private void reverse(int[] nums, int start, int end) {
            if (start > end) return;
            for (int i = start; i <= (start + end) / 2; i++)
                swap(nums, i, end - i + start);
        }

    // solution 2
    public String getPermutation2(int n, int k) {
        if (n < 1 || k < 1) return new String();
        int[] fact = new int[n];
        fact[0] = 1;
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum *= i;
            fact[i] = sum;
        }
        k--;    //subtract 1 because of things always starting at 0
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) nums.add(i + 1);
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int index = k / fact[n - i];
            res.append(String.valueOf(nums.get(index)));
            nums.remove(index);
            k -= index * fact[n - i];
        }

        return res.toString();
    }
}
