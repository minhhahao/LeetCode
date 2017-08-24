package com.hazza.LeetCodeByJava;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/climbing-stairs/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-24
 * Time: 9:16 AM
 */
public class No70ClimbingStairs {
    // solution 1
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n - 1];
    }

    // solution 2
    public int climbStairs2(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int a = 2, b = 1, res = 0;

        for(int i=2; i<n; i++){
            res = a + b;
            b = a;
            a = res;
        }
        return res;
    }
}
