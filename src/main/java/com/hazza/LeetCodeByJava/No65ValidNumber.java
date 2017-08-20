package com.hazza.LeetCodeByJava;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/valid-number/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-20
 * Time: 9:23 AM
 */
public class No65ValidNumber {
    public boolean isNumber(String s) {
        s = s.trim();
        int len = s.length();
        boolean numberFlag = false;
        boolean eFlag = false;
        boolean pointFlag = false;
        boolean numberAfterEFlag = false;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numberFlag = true;
                numberAfterEFlag = true;
            } else if (s.charAt(i) == 'e') {
                if (!numberFlag || eFlag) return false;
                eFlag = true;
                numberAfterEFlag = false;
            } else if (s.charAt(i) == '.') {
                if (eFlag || pointFlag) return false;
                pointFlag = true;
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e') return false;
            } else return false;
        }

        return numberFlag && numberAfterEFlag;
    }
}
