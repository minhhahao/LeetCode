package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/powx-n/description/
 */
public class No50Pow {
    // solution 1
    public double myPow(double x, int n) {
        if (n == 0 || x == 1.0) return 1.0;
        if (n == Integer.MIN_VALUE) return x == -1.0 ? 1.0 : 0.0;
        boolean isNegative = n < 0 ? true : false;
        if (x == 0) return isNegative ? (1 / 0.0) : 0.0;

        n = Math.abs(n);
        double res = 1.0;
        while (n > 0) {
            if ((n&1) == 1) res *= x;   //judge even or odd
            x *= x;
            n >>= 1;
        }

        return isNegative ? (1 / res) : res;
    }

    //solution 2
    public double myPow2(double x, int n) {
        if (n == 0) return 1.0;
        if(n<0) return 1/x * myPow2(1/x, -(n+1));
        if (n == 2) return x * x;
        if (n % 2 == 0) return myPow2(myPow2(x, n / 2), 2);
        else return x * myPow(myPow2(x, n / 2), 2);
    }
}
