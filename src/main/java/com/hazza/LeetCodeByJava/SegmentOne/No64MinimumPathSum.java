package com.hazza.LeetCodeByJava.SegmentOne;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/minimum-path-sum/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-19
 * Time: 9:17 AM
 */
public class No64MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i != 0 && j != 0)
                    dp[i][j] = Math.min(grid[i][j] + dp[i - 1][j], grid[i][j] + dp[i][j - 1]);
                else if (i != 0)
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                else if (j != 0)
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                else
                    dp[i][j] = grid[i][j];
            }
        }

        return dp[row - 1][col - 1];
    }
}
