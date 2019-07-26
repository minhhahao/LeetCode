package com.hazza.leetcode.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/unique-binary-search-trees/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-11
 * Time: 10:19 AM
 */
public class No96UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];

        dp[0] = dp[1] = 1;
        for (int i = 2; i <=n ; i++)
            for (int j = 1; j <= i; j++)
                dp[i] += dp[j - 1] * dp[i - j];

        return dp[n];
    }
}
