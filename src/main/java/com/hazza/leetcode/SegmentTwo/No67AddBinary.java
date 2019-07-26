package com.hazza.leetcode.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/add-binary/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-21
 * Time: 10:43 AM
 */
public class No67AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int flag = 0;
        while (i >= 0 || j >= 0) {
            int sum = flag;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            res.append(sum % 2);
            flag = sum / 2;
        }
        if (flag == 1) res.append(flag);

        return res.reverse().toString();
    }
}
