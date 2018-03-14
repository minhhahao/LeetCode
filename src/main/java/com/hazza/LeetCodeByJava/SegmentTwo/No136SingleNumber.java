package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/single-number/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-13
 * Time: 9:44 PM
 */
public class No136SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (Integer i: nums) res ^= i;

        return res;
    }
}
