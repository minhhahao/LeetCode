package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/reverse-integer/?tab=Description#/description
 */
public class No7ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRes = res * 10 + tail;
            if ((newRes - tail) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;
    }
}
