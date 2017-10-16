package com.hazza.LeetCodeByJava.SegmentOne;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/search-a-2d-matrix/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-27
 * Time: 9:08 AM
 */
public class No74SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while (left < right) {
            int middle = (left + right) >> 1;
            if (matrix[middle / cols][middle % cols] == target) return true;
            else if (matrix[middle / cols][middle % cols] < target) left = middle + 1;
            else right = middle - 1;
        }

        return matrix[left / cols][left % cols] == target;
    }
}
