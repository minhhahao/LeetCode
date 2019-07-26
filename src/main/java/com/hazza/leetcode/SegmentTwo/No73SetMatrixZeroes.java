package com.hazza.leetcode.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/set-matrix-zeroes/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-26
 * Time: 9:37 AM
 */
public class No73SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length, colLen = matrix[0].length;
        boolean firstColIs0 = false;
        for (int i = 0; i < rowLen; i++) {
            if (matrix[i][0] == 0) firstColIs0 = true;
            for (int j = 1; j < colLen; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
        for (int i = rowLen - 1; i >= 0; i--) {
            for (int j = colLen - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
            if (firstColIs0) matrix[i][0] = 0;
        }
    }
}
