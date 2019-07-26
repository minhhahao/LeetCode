package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/wildcard-matching/discuss/
 */
public class No44WildcardMatching {
    // solution 1
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) return s.length() == 0;
        int si = 0, pi = 0, start = -1, match = 0;
        int lenS = s.length(), lenP = p.length();
        while (si < lenS) {
            if (pi < lenP && (s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '?')) {
                ++si;
                ++pi;
            } else if (pi < lenP && p.charAt(pi) == '*') {
                start = pi;
                match = si;
                ++pi;
            } else if (start != -1){
                pi = start + 1;
                ++match;
                si = match;
            } else return false;
        }

        while (pi < lenP && p.charAt(pi) == '*') ++pi;
        return pi == lenP;
    }

    // solution 2.1
    public boolean isMatch2(String s, String p) {
        if (p.length() == 0) return s.length() == 0;
        int lenS = s.length(), lenP = p.length();
        boolean[][] m = new boolean[lenS + 1][lenP + 1];

        m[0][0] = true;
        for (int i = 1; i <= lenP; i++)
            m[0][i] = m[0][i - 1] && p.charAt(i - 1) == '*';

        for (int i = 1; i <= lenS; i++) {
            for (int j = 1; j <= lenP; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?')
                    m[i][j] = m[i - 1][j - 1];
                else if (p.charAt(j - 1) == '*')
                    m[i][j] = m[i - 1][j] || m[i][j - 1];
            }
        }
        return m[lenS][lenP];
    }

    // solution 2.2
    public boolean isMatch3(String s, String p) {
        if (p.length() == 0) return s.length() == 0;
        int lenS = s.length(), lenP = p.length();
        boolean[] m = new boolean[lenS + 1];
        m[0] = true;
        for (int j = 1; j <= lenP; j++) {
            boolean pre = m[0];
            m[0] = m[0] && p.charAt(j - 1) == '*';
            for (int i = 1; i <= lenS; i++) {
                boolean temp = m[i];
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?')
                    m[i] = pre;
                else if (p.charAt(j - 1) == '*')
                    m[i] = (m[i] || m[i - 1]);
                else m[i] = false;
                pre = temp;
            }
        }
        return m[lenS];
    }
}
