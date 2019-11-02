package com.hazza.leetcode.dp;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/distinct-subsequences/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-27
 * Time: 1:49 PM
 */
public class No115DistinctSubsequences {

    // solution 1
    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= m; i++) dp[0][i] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(j - 1) == t.charAt(i - 1)) dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                else dp[i][j] = dp[i][j - 1];
            }
        }

        return dp[n][m];
    }

    // solution 2
    public int numDistinct1(String s, String t) {
        int m = s.length(), n = t.length();
        int[] dp = new int[m + 1];
        int prev = 1;

        for (int i = 1; i <= m; i++) dp[i] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int temp = dp[j];
                if (s.charAt(j - 1) == t.charAt(i - 1)) dp[j] = dp[j - 1] + prev;
                else dp[j] = dp[j - 1];
                prev = temp;
            }
            prev = 0;
        }

        return dp[m];
    }

}