package com.hazza.leetcode.SegmentOne;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/#/description
 */
public class No20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) return false;
            if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) return false;
            if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) return false;
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
