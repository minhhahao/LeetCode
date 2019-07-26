package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/rotate-image/description/
 */
public class No48RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++)
                swap(matrix, i, j, j, i);
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++)
                swap(matrix, i, j, i, len - 1 - j);
        }
    }

    private void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        if (matrix[r1][c1] != matrix[r2][c2]) {
            matrix[r1][c1] ^= matrix[r2][c2];
            matrix[r2][c2] ^= matrix[r1][c1];
            matrix[r1][c1] ^= matrix[r2][c2];
        }
    }
}
