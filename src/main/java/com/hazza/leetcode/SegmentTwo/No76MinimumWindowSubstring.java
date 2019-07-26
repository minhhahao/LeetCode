package com.hazza.leetcode.SegmentTwo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/minimum-window-substring/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-29
 * Time: 10:33 AM
 */
public class No76MinimumWindowSubstring {
    // solution 1
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c: t.toCharArray()) map[c]++;
        int len = s.length(), counter = t.length(), begin = 0, end = 0, head = 0, min = Integer.MAX_VALUE;
        while (end < len) {
            if (map[s.charAt(end++)]-- > 0) --counter;
            while (counter == 0) {
                if (end - begin < min) min = end - (head = begin);
                if (map[s.charAt(begin++)]++ == 0) counter++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(head, head + min);
    }

    // solution 2
    public String minWindow1(String s, String t) {
        int len = s.length(), counter = t.length(), begin = 0, end = 0, head = 0, min = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>(counter);
        for (char c: t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        while (end < len) {
            if (map.containsKey(s.charAt(end))) {
                if (map.get(s.charAt(end)) > 0) --counter;
                map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
            }
            end++;
            while (counter == 0) {
                if (end - begin < min) min = end - (head = begin);
                if (map.containsKey(s.charAt(begin))) {
                    if (map.get(s.charAt(begin)) == 0) ++counter;
                    map.put(s.charAt(begin), map.get(s.charAt(begin)) + 1);
                }
                ++begin;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(head, head + min);
    }
}
