package com.hazza.leetcode.SegmentOne;

/**
 * https://leetcode.com/problems/zigzag-conversion/#/description
 */
public class No6ZigZagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < numRows; ++i) sb[i] = new StringBuffer();
        for (int i = 0; i < len;) {
            for (int idx = 0; i < len && idx < numRows; ++idx) {
                sb[idx].append(c[i++]);
            }
            for (int idx = numRows - 2; i < len && idx >= 1; --idx) {
                sb[idx].append(c[i++]); //因为想要有zigzag的形状，至少要有三层，所以从倒数第二行开始
            }
        }
        for (int idx = 1; idx < numRows; ++idx) {
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }
}
