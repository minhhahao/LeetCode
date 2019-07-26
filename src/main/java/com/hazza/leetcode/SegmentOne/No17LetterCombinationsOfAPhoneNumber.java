package com.hazza.leetcode.SegmentOne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/#/description
 */
public class No17LetterCombinationsOfAPhoneNumber {
    //solution 1
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        if(digits.isEmpty()) return res;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        res.add("");
        for (int i = 0; i < digits.length(); ++i) {
            int pos = Character.getNumericValue(digits.charAt(i));
            while (res.peek().length() == i) {
                String temp = res.remove();
                for (char c: mapping[pos].toCharArray())
                    res.add(temp + c);
            }
        }

        return res;
    }

    //solution 2
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations2(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;
        combinations("", digits, 0, res);

        return res;
    }

    private void combinations(String prefix, String digits, int pos, List<String> res) {
        if (pos == digits.length()) {
            res.add(prefix);
            return;
        }
        for (char c: KEYS[Character.getNumericValue(digits.charAt(pos))].toCharArray())
            combinations(prefix + c, digits, pos + 1, res);
    }
}
