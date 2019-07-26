package com.hazza.leetcode.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/plus-one/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-21
 * Time: 10:19 AM
 */
public class No66PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

        for (int i = len - 1; i >= 0; i--) {
            if (++digits[i] == 10) digits[i] = 0;
            else return digits;
        }
        int[] res = new int[len + 1];
        res[0] = 1;
        return res;
    }
}
