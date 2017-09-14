package com.hazza.LeetCodeByJava;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-13
 * Time: 5:21 PM
 */
public class No85MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0|| matrix[0].length == 0) return 0;
        int rowLen = matrix.length, colLen = matrix[0].length;
        int[] left = new int[colLen];
        int[] right = new int[colLen];
        int[] height = new int[colLen];
        Arrays.fill(right, colLen);
        int maxArea = 0;
        for (int i = 0; i < rowLen; i++) {
            int curLeft = 0, curRight = colLen;
            for (int j = 0; j < colLen; j++) {
                if (matrix[i][j] == '1') ++height[j];
                else height[j] = 0;
            }
            for (int j = 0; j < colLen; j++) {
                if (matrix[i][j] == '1') left[j] = Math.max(left[j], curLeft);
                else {
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }
            for (int j = colLen - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') right[j] = Math.min(right[j], curRight);
                else {
                    right[j] = colLen;
                    curRight = j;
                }
            }
            for (int j = 0; j < colLen; j++) {
                maxArea = Math.max(maxArea, (right[j] - left[j]) * height[j]);
            }
        }
        return maxArea;
    }
}
