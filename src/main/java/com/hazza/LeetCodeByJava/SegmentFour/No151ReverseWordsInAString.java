package com.hazza.LeetCodeByJava.SegmentFour;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/reverse-words-in-a-string/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-7
 * Time: 10:06 AM
 */
public class No151ReverseWordsInAString {

    /**
     * Solution 1
     */
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        Deque<String> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() >  0) {
            stack.push(sb.toString());
        }

        if (stack.isEmpty()) {
            return "";
        }

        sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);


        return sb.toString();
    }

    /**
     * Solution 2
     */
    public String reverseWords1(String s) {
        if (s == null) {
            return null;
        }

        char[] chars = s.toCharArray();
        int n = s.length();

        // reverse the total string
        reverse(chars, 0, n - 1);
        // reverse each word
        reverseWords(chars, n);
        // clean spaces
        return cleanSpaces(chars, n);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

    private void reverseWords(char[] chars, int n) {
        int i = 0, j = 0;
        char space = ' ';

        while (j < n) {
            // skip spaces
            while (i < j || i < n && chars[i] == space) {
                ++i;
            }
            // slip non spaces
            while (j < i || j < n && chars[j] != space) {
                ++j;
            }
            // reverse word
            reverse(chars, i, j - 1);
        }
    }

    private String cleanSpaces(char[] chars, int n) {
        int i = 0, j = 0;
        char space = ' ';

        while (j < n) {
            while (j < n && chars[j] == space) {
                ++j;
            }
            while (j < n && chars[j] != space) {
                chars[i++] = chars[j++];
            }
            while (j < n && chars[j] == space) {
                ++j;
            }
            if (j < n) {
                chars[i++] = space;
            }
        }

        return new String(chars).substring(0, i);
    }
}
