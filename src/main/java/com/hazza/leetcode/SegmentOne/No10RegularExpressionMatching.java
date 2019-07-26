package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/regular-expression-matching/#/description
 */
public class No10RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (s.equals("") || s == null || p.equals("") || p == null) return false;
        if (s.equals(p)) return true;
        int lenS = s.length(), lenP = p.length();
        int start = -1;

        for (int i = 0; i < lenP; i++) {
            if (s.charAt(0) == p.charAt(i) || p.charAt(i) == '.') {
                start = i + 1;
                break;
            }
        }
        if (start == -1 || (start == lenP && lenS > 1)) return false;

        for (int i = 1; i < lenS; i++) {
            if (start == lenP) return false;
            if (s.charAt(i) == p.charAt(start) || p.charAt(start) == '.') {
                ++start;
            } else if (p.charAt(start) == '*') {
                if (p.charAt(start - 1) == '.') return true;
                if (p.charAt(start - 1) != s.charAt(i)) ++start;
            }  else return false;
        }
        return true;
    }
}
