package com.hazza.leetcode.SegmentOne;

import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams/discuss/
 */
public class No49GroupAnagrams {
    // solution 1
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    //solution 2
    public List<List<String>> groupAnagrams2(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            String key = encode(str);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    private String encode(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++)
            ++count[str.charAt(i) - 'a'];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count.length; i++)
            if (count[i] != 0) sb.append((char) ('a' + i)).append(count[i]);

        return sb.toString();
    }

}
