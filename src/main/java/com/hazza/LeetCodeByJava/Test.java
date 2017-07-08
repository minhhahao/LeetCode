package com.hazza.LeetCodeByJava;

import java.math.BigInteger;

/**
 * Created by hazza on 7/7/17.
 */
public class Test {
    public static BigInteger fact2(BigInteger n) {
        if (n.intValue() == 1) return new BigInteger("1");
        return n.multiply(fact(n.subtract(new BigInteger("1"))));
    }

    public static BigInteger fact(BigInteger n) {
        return fact_iter(n, new BigInteger("1"));
    }

    private static BigInteger fact_iter(BigInteger n, BigInteger p) {
        if (n.intValue() == 1) return p;
        return fact_iter(n.subtract(new BigInteger("1")), n.multiply(p));
    }

    public static BigInteger loop(BigInteger n) {
        BigInteger value = new BigInteger("1");
        for (int i = 1; i < n.intValue(); ++i)
            value = value.multiply(new BigInteger("" + i));
        return value;
    }

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        System.out.println(Test.loop(new BigInteger("9900")));
        System.out.println(System.currentTimeMillis() - s);

    }
}
