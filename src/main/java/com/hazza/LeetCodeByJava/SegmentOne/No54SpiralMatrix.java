package com.hazza.LeetCodeByJava.SegmentOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/spiral-matrix/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-10
 * Time: 8:46 AM
 */
public class No54SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        int rowBegin = 0, rowEnd = matrix.length - 1, colBegin = 0, colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            //left to right
            for (int i = colBegin; i <= colEnd; i++)
                res.add(matrix[rowBegin][i]);
            ++rowBegin;
            //top to down
            for (int i = rowBegin; i <= rowEnd; i++)
                res.add(matrix[i][colEnd]);
            --colEnd;
            //right to left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--)
                    res.add(matrix[rowEnd][i]);
            }
            --rowEnd;
            //down to top
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--)
                    res.add(matrix[i][colBegin]);
            }
            ++colBegin;
        }

        return res;
    }
}
