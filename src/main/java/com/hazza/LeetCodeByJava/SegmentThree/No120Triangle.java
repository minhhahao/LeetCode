package com.hazza.LeetCodeByJava.SegmentThree;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/triangle/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-2
 * Time: 5:32 PM
 */
public class No120Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[] dp = new int[len + 1];
        for (int i = 0; i <= len; i++) dp[i] = Integer.MAX_VALUE;

        dp[1] = triangle.get(0).get(0);
        for (int i = 1; i < len; i++) {
            List<Integer> row = triangle.get(i);
            int rowLen = row.size();
            int prev = dp[0];
            for (int j = 1; j <= rowLen ; j++) {
                int temp = dp[j];
                dp[j] = row.get(j - 1) + Math.min(prev, dp[j]);
                prev = temp;
            }
        }

        int min = dp[1];
        for (int i = 2; i <= len; i++) min = (min <= dp[i]) ? min : dp[i];

        return min;
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[] dp = new int[len + 1];

        for (int i = len - 1; i >= 0; --i) {
            List<Integer> row = triangle.get(i);
            int rowLen = row.size();
            for (int j = 0; j < rowLen; j++)
                dp[j] = Math.min(dp[j], dp[j+1]) + row.get(j);
        }

        return dp[0];
    }

}
