package com.hazza.LeetCodeByJava;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
 */
public class No3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] flag = new boolean[128];
        int maxLen = 0;
        int len = 0;
        for (int i = 0;i < s.length();++i) {
            char c = s.charAt(i);
            if (flag[c] == true) {
                flag = new boolean[128]; //建立一个ASCII码值表
                maxLen = (maxLen > len) ? maxLen : len;
                i -= len; //若出现重复字符，恢复到重复字符第一次出现的地方，并在下一次循环加1，恢复到重复字符第一次出现的下一个字母
                len = 0;
            } else {
                ++len;
                flag[c] = true;
            }
        }
        maxLen = (maxLen > len) ? maxLen : len; //防止出现没有重复字符的字符串

        return maxLen;
    }
}
