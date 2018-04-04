package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/sqrtx/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-23
 * Time: 9:59 AM
 */
public class No69SqrtX {
    //solution 1
    public int mySqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle == x / middle) return middle;
            else if (middle < x / middle) left = middle + 1;
            else right = middle - 1;
        }

        return right;
    }

    // solution 2
    public int mySqrt2(int x) {
        double r = x;
        while (Math.abs(r * r - x) > 0.0001)
            r = (r + x / r) / 2;
        return (int) r;
    }
}
