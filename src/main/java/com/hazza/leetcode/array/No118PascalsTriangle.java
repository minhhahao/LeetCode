package com.hazza.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/pascals-triangle/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-30
 * Time: 2:13 PM
 */
public class No118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < i; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            res.add(new ArrayList<>(row));
        }

        return res;
    }
}
