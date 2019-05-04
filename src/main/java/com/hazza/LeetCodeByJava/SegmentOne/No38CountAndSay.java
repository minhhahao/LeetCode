package com.hazza.LeetCodeByJava.SegmentOne;

/**
 * https://leetcode.com/problems/count-and-say/#/description
 */
public class No38CountAndSay {

    //Solution 1
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String str = countAndSay(n - 1);
        int count = 1;
        StringBuilder res = new StringBuilder();
        char[] cs = str.toCharArray();
        for (int i = 1, len = cs.length; i < len; i++) {
            if (cs[i] == cs[i - 1]) ++count;
            else {
                res.append(count).append(cs[i - 1]);
                count = 1;
            }
        }
        res.append(count).append(cs[cs.length - 1]);
        return res.toString();
    }

    //Solution 2
    public String countAndSay2(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev = new StringBuilder();
        int count = 1;

        for (int i = 1; i < n; i++) {
            prev = curr;
            curr = new StringBuilder();
            count = 1;
            char c = prev.charAt(0);
            for (int j = 1, len = prev.length(); j < len; j++) {
                if (prev.charAt(j) != c) {
                    curr.append(count).append(c);
                    count = 1;
                    c = prev.charAt(j);
                } else ++count;
            }
            curr.append(count).append(c);
        }

        return curr.toString();
    }
}
