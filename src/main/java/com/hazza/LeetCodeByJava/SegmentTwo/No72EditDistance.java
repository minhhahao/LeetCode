package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/edit-distance/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-25
 * Time: 9:10 AM
 */
public class No72EditDistance {

    // solution 1
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) dp[i][0] = i;
        for (int i = 0; i <= n; i++) dp[0][i] = i;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else {
                    int insert = dp[i][j - 1];
                    int delete = dp[i - 1][j];
                    int replace = dp[i - 1][j - 1];
                    dp[i][j] = Math.min(Math.min(insert, delete), replace) + 1;
                }
            }
        }

        return dp[m][n];
    }

    // solution 2
    public int minDistance1(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) dp[i] = i;
        for (int i = 1; i <= m; i++) {
            int prev = i;
            for (int j = 1; j <= n; j++) {
                int cur;
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    cur = dp[j - 1];
                else {
                    int insert = prev;
                    int delete = dp[j];
                    int replace = dp[j - 1];
                    cur = Math.min(Math.min(insert, delete), replace) + 1;
                }
                dp[j - 1] = prev;
                prev = cur;
            }
            dp[n] = prev;
        }

        return dp[n];
    }

}
