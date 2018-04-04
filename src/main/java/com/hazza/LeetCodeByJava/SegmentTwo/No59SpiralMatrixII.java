package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with Intellii IDEA.
 * Description: https://leetcode.com/problems/spiral-matrix-ii/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-14
 * Time: 8:38 AM
 */
public class No59SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        if (n <= 0) return new int[0][0];
        int rowBegin = 0, rowEnd = n - 1, colBegin = 0, colEnd = n - 1;
        int count = 1;
        int[][] res = new int[n][n];
        while (count <= n * n) {
            // left to right
            for (int i = colBegin; i <= colEnd; i++, count++)
                res[rowBegin][i] = count;
            ++rowBegin;
            // top to down
            for (int i = rowBegin; i <= rowEnd; i++, count++)
                res[i][colEnd] = count;
            --colEnd;
            // right to left
            if (rowEnd >= rowBegin) {
                for (int i = colEnd; i >= colBegin; i--, count++)
                    res[rowEnd][i] = count;
            }
            --rowEnd;
            // down to top
            if (colEnd >= colBegin) {
                for (int i = rowEnd; i >= rowBegin; i--, count++)
                    res[i][colBegin] = count;
            }
            ++colBegin;
        }
        return res;
    }
}
