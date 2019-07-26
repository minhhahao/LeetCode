package com.hazza.leetcode.SegmentThree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/palindrome-partitioning/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-5
 * Time: 4:28 PM
 */
public class No131PalindromePartitioning {

    private void dfs(String s, int pos, List<String> solution, List<List<String>> res) {
        int len = s.length();
        if (pos == len) {
            res.add(new ArrayList<>(solution));
        } else {
            for (int i = pos; i < len; i++) {
                if (isPalindrome(s, pos, i)) {
                    solution.add(s.substring(pos, i + 1));
                    dfs(s, i + 1, solution, res);
                    solution.remove(solution.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--)) return false;

        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> solution = new ArrayList<>();
        dfs(s, 0, solution, res);

        return res;
    }
}
