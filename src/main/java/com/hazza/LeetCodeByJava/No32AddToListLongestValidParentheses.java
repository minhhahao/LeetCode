package com.hazza.LeetCodeByJava;

import java.util.Stack;

/**
 * https://leetcode.com/problems/longest-valid-parentheses/description/
 */
public class No32AddToListLongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int len = s.length(), max = 0, left = -1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                if (stack.isEmpty()) left = i;
                else {
                    stack.pop();
                    if (stack.isEmpty()) max = Math.max(max, i - left);
                    else max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }

    public int longestValidParentheses2(String s) {
        int len = s.length(), max = 0;
        int[] longest = new int[len + 1];
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') longest[i] = (i >= 2 ? longest[i - 2] + 2 : 2);
                else {
                    if (i - longest[i - 1] - 1 >= 0 && s.charAt(i - longest[i - 1] - 1) == '(')
                        longest[i] = longest[i - 1] + 2 +
                                (i - longest[i - 1] - 2 >= 0 ? longest[i - longest[i - 1] - 2] : 0);
                }
            }
            max = Math.max(longest[i], max);
        }
        return max;
    }

}
