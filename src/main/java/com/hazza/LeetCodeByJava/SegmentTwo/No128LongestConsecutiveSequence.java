package com.hazza.LeetCodeByJava.SegmentTwo;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/longest-consecutive-sequence/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-2
 * Time: 2:21 PM
 */
public class No128LongestConsecutiveSequence {

    // solution 1
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) set.add(i);

        int longest = 0;
        for (int i: nums) {
            if (!set.contains(i - 1)) {
                int temp = i + 1, curLen = 1;
                while (set.contains(temp++)) ++curLen;
                longest = Math.max(longest, curLen);
            }
        }

        return longest;
    }

    // solution 2
    public int longestConsecutive1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int longest = 0;
        for (int i: nums) {
            if (!map.containsKey(i)) {
                int left = map.getOrDefault(i - 1, 0);
                int right = map.getOrDefault(i + 1, 0);
                int sum = left + 1 + right;
                longest = Math.max(longest, sum);

                map.put(i, sum);
                map.put(i - left, sum);
                map.put(i + right, sum);
            }
        }

        return longest;
    }

}
