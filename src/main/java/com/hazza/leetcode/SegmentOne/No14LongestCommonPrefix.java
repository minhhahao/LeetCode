package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/longest-common-prefix/#/description
 */
public class No14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];

        for(int i = 1; i < strs.length; ++i) {
            int j = 0;
            for(; j < pre.length(); ++j) {
                if (j >= strs[i].length() || pre.charAt(j) != strs[i].charAt(j))
                    break;
            }
            pre = pre.substring(0, j);
        }

        return pre;
    }
}
