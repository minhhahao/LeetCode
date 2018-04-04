package com.hazza.LeetCodeByJava.SegmentThree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/word-break/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-17
 * Time: 12:59 PM
 */
public class No139WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>();
        for (String word : wordDict) wordSet.add(word);
        int len = s.length();
        boolean[] dp = new boolean[len + 1];

        dp[0] = true;
        for (int i = 1; i <= len; i++)
            for (int j = 0; j < i; j++)
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }

        return dp[len];
    }
}
