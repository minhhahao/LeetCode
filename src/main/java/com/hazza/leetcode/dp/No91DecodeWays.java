package com.hazza.leetcode.dp;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/decode-ways/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-28
 * Time: 8:34 AM
 */
public class No91DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = (s.charAt(n - 1) == '0' ? 0 : 1);

        for (int i = n - 2; i >= 0; i--) {
            if(s.charAt(i) != '0') {
                dp[i] = (Integer.parseInt(s.substring(i, i + 2)) <= 26 ?
                        dp[i + 1] + dp[i + 2] : dp[i + 1]);
            }
        }

        return dp[0];
    }
}
