package com.hazza.LeetCodeByJava.dfs;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/scramble-string/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-24
 * Time: 10:33 AM
 */
public class No87ScrambleString {
    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) return true;

        int[] chars = new int[26];
        int len1 = s1.length(), len2 = s2.length();
        for (int i = 0; i < len1; i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) if (chars[i] != 0) return false;

        for (int i = 1; i < len1; i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0, i))
                    && isScramble(s1.substring(i), s2.substring(i))) return true;
            if (isScramble(s1.substring(0, i), s2.substring(len2 - i))
                    && isScramble(s1.substring(i), s2.substring(0, len2 -i))) return true;
        }
        return false;
    }
}
