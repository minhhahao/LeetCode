package com.hazza.leetcode.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/unique-paths-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-18
 * Time: 7:08 PM
 */
public class No63UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[] dp = new int[col + 1];
        dp[1] = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= col; j++) {
                if (obstacleGrid[i][j-1] == 1) dp[j] = 0;
                else dp[j] = dp[j] + dp[j - 1];
            }
        }

        return dp[col];
    }
}
