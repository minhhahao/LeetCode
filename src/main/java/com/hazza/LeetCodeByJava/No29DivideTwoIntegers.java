package com.hazza.LeetCodeByJava;

/**
 * Created by hazza on 7/15/17.
 */
public class No29DivideTwoIntegers {
    //solution 1
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if ((dividend == 0)) return 0;

        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) sign = -1;

        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long)divisor);

        long resL = ldivide(dividendL, divisorL);
        int res = 0;
        if (resL > Integer.MAX_VALUE) res = (sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE);   //处理溢出
        else res = (int)(sign * resL);

        return res;
    }

    private long ldivide(long dividendL, long divisorL) {
        if (dividendL < divisorL) return 0;

        long sum = divisorL, multiply = 1;
        while ((sum + sum) <= dividendL) {
            sum += sum;
            multiply += multiply;
        }

        return multiply + ldivide(dividendL - sum, divisorL);
    }

    //solution 2
    public int divide2(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == 0) return 0;
        boolean isNeg = (dividend < 0) ^ (divisor < 0);
        long dividendL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);
        long sum = 0;
        long res = 0;
        long base = divisorL;
        int incr = 1;
        while (true) {
            if (sum + base <= dividendL) {
                res += incr;
                if (sum == dividend) break;
                sum += base;
                base <<= 1;
                incr <<= 1;
            } else {
                if (incr == 1) break;
                base >>>= 1;
                incr >>>= 1;
            }
        }
        return isNeg ? (int)-res : (int)Math.min(res, Integer.MAX_VALUE);
    }
}
