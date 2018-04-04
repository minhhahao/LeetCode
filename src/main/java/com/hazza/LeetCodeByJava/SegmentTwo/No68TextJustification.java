package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/text-justification/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-22
 * Time: 9:11 AM
 */
public class No68TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int len = words.length, start = 0;
        while (start < len) {
            int curLen = words[start].length();
            int last = start + 1;
            while (last < len) {
                if (curLen + words[last].length() + 1 > maxWidth) break;
                else curLen += words[last].length() + 1;
                ++last;
            }
            StringBuilder sb = new StringBuilder();
            // check the last line and the line which contains single word
            int diff = last - 1 - start;
            if (last == len || diff == 0) {
                for (int i = start; i < last; i++) sb.append(words[i] + " ");
                sb.deleteCharAt(sb.length() - 1);
                sb.append(createSpace(maxWidth - sb.length()));
            } else {
                int spaces = (maxWidth - curLen) / diff;
                int extraSpaces = (maxWidth - curLen) % diff;
                for (int i = start; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) {
                        int extra = (i - start < extraSpaces ? 1 : 0);
                        sb.append(createSpace(1 + spaces + extra));
                    }
                }
            }
            res.add(sb.toString());
            start = last;
        }

        return res;
    }

    private String createSpace(int num) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num; i++) sb.append(" ");
        return sb.toString();
    }
}
