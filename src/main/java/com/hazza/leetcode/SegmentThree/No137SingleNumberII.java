package com.hazza.leetcode.SegmentThree;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/single-number-ii/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-14
 * Time: 7:15 PM
 */
public class No137SingleNumberII {

    // solution 1
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (Integer n: nums)
                sum += (n >> i) & 1;
            res |= (sum % 3 << i);
        }

        return res;
    }


    // solution 2
    public int singleNumber1(int[] nums) {
        int ones = 0, twos = 0;

        for (Integer i: nums) {
            ones = (ones ^ i) & ~twos;
            twos = (twos ^ i) & ~ones;
        }

        return ones;
    }
}
