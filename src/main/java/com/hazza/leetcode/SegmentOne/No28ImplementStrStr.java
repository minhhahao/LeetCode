package com.hazza.leetcode.SegmentOne;

/**
 * Created by hazza on 7/14/17.
 */
public class No28ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (haystack == null || needle == null) return -1;
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        int len1 = haystackChar.length, len2 = needleChar.length;
        for (int i = 0; i < len1; i++) {
            if (haystackChar[i] == needleChar[0] && i + len2 <= len1) {
                int j = 1;
                while (j < len2) {
                    if (haystackChar[i + j] != needleChar[j]) break;
                    ++j;
                }
                if (j == len2) return i;
            } else if (i + len2 > len1) {
                return -1;
            }
        }
        return -1;
    }
}
