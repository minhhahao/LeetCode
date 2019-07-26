package com.hazza.leetcode.SegmentOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/#/description
 */
public class No22GenerateParentheses {
    //solution 1
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n < 1) return res;

        insertBrackets(res, "", 0, 0, n);

        return res;
    }

    private void insertBrackets(List<String> res, String str, int openBrackets, int closeBrackets, int max) {
        if (openBrackets + closeBrackets == max * 2) res.add(str);

        if (openBrackets < max) insertBrackets(res, str + '(', openBrackets + 1, closeBrackets, max);
        if (closeBrackets < openBrackets) insertBrackets(res, str + ')', openBrackets, closeBrackets + 1, max);
    }

    //solution 2
    public List<String> generateParenthesis2(int n) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Collections.singletonList(""));

        for (int i = 1; i <= n; ++i)
        {
            final List<String> list = new ArrayList<>();
            for (int j = 0; j < i; ++j)
            {
                for (final String first: lists.get(j))
                {
                    for (final String second: lists.get(i - 1 - j))
                    {
                        list.add("(" + first + ")" + second);
                    }
                }
            }
            lists.add(list);
        }
        return lists.get(lists.size() - 1);
    }

}
