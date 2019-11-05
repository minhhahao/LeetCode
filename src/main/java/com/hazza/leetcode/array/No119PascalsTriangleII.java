package com.hazza.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/pascals-triangle-ii/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-31
 * Time: 1:47 PM
 */
public class No119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);

        res.add(1);
        for (int i = 0; i < rowIndex; i++) {
            for (int j = i; j > 0; j--)
                res.set(j, res.get(j) + res.get(j - 1));
            res.add(1);
        }

        return res;
    }
}
