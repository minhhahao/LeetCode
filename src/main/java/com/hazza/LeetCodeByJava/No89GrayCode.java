package com.hazza.LeetCodeByJava;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/gray-code/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-26
 * Time: 10:25 AM
 */
public class No89GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < 1<<n; i++) res.add(i ^ i>>1);
        return res;
    }
}
