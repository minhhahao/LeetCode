package com.hazza.LeetCodeByJava;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/unique-paths/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-15
 * Time: 5:19 PM
 */
public class No62UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m < 1 || n < 1) return 0;
        if (m == 1 || n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 1 ; i <= m; i++)
            for (int j = 1; j <= n; j++)
                dp[j] = dp[j] + dp[j - 1];

        return dp[n];
    }
}
