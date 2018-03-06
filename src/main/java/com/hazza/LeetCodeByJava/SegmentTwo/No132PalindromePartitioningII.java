package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/palindrome-partitioning-ii/discuss/42213/Easiest-Java-DP-Solution-(97.36)
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-6
 * Time: 1:08 PM
 */
public class No132PalindromePartitioningII {

    // solution 1
    public int minCut(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        boolean[][] isPalidrome = new boolean[len][len];
        int[] minCut = new int[len];

        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = 0; j <= i; j++) {
                if (chars[i] == chars[j] && (j + 1 > i - 1 || isPalidrome[j + 1][i - 1])) {
                    isPalidrome[j][i] = true;
                    min = (j == 0) ? 0 : Math.min(min, minCut[j - 1] + 1);
                }
            }
            minCut[i] = min;
        }

        return minCut[len - 1];
    }

    // solution 2
    public int minCut1(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int[] minCut = new int[len + 1];
        for (int i = 0; i <= len; i++) minCut[i] = i - 1;

        for (int i = 0; i < len; i++) {
            // odd
            for (int j = 0; i - j >= 0 && i + j < len && chars[i - j] == chars[i + j]; j++)
                minCut[i + j + 1] = Math.min(minCut[i + j + 1], minCut[i - j] + 1);
            // even
            for (int j = 1; i - j + 1 >= 0 && i + j < len && chars[i - j + 1] == chars[i + j]; j++)
                minCut[i + j + 1] = Math.min(minCut[i + j + 1], minCut[i - j + 1] + 1);
        }

        return minCut[len];
    }
}
