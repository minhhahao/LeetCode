package com.hazza.leetcode.SegmentThree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-6
 * Time: 10:40 AM
 */
public class No150EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token: tokens) {

            if ("+".equals(token)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if ("-".equals(token)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if ("*".equals(token)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
            } else if ("/".equals(token)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

}
