package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/word-ladder/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-1
 * Time: 2:09 PM
 */
public class No127WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList), visited = new HashSet<>(),
                beginSet = new HashSet<>(), endSet = new HashSet<>();
        if (!wordSet.contains(endWord)) return 0;
        int len = 1, wordLen = beginWord.length();

        beginSet.add(beginWord);
        endSet.add(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set<String> tmp = beginSet;
                beginSet = endSet;
                endSet = tmp;
            }
            Set<String> temp = new HashSet<>();
            for (String word: beginSet) {
                char[] chs = word.toCharArray();

                for (int i = 0; i < wordLen; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chs[i];
                        chs[i] = c;
                        String target = String.valueOf(chs);
                        if (endSet.contains(target)) {
                            System.out.println(target);
                            return len + 1;
                        }
                        if (!visited.contains(target) && wordSet.contains(target)) {
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }
                    
                }
            }
            beginSet = temp;
            ++len;
        }

        return 0;
    }
}
