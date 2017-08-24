package com.hazza.LeetCodeByJava;

import java.util.Deque;
import java.util.LinkedList;

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
        Deque<String> queue = new LinkedList<>();
        for (String s: symbols) {
            if (s.equals("..") && !queue.isEmpty()) queue.pollLast();
            else if (!s.equals(".") && !s.equals("") && !s.equals("..")) queue.offerLast(s);
        }

        return "/" + String.join("/", queue);
    }
}
