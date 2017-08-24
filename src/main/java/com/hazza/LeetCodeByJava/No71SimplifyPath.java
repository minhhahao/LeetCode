package com.hazza.LeetCodeByJava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/simplify-path/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-24
 * Time: 9:38 AM
 */
public class No71SimplifyPath {
    public String simplifyPath(String path) {
        String[] symbols = path.split("/+");
        Deque<String> stack = new LinkedList<>();
        for (String s: symbols) {
            if (s.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!s.equals(".") && !s.equals("") && !s.equals("..")) stack.push(s);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append("/" + stack.pollLast());

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
