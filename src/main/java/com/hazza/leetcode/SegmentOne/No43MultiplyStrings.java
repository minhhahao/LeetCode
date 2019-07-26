package com.hazza.leetcode.SegmentOne;

/**
 * Created by hazza on 7/28/17.
 * https://leetcode.com/problems/multiply-strings/tabs/description
 */
public class No43MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] num = new int[m + n];
        StringBuilder sb = new StringBuilder();

        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                int p = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int i1 = i + j, i2 = i + j + 1;
                int sum = num[i2] + p;
                num[i1] += sum / 10;
                num[i2] = sum % 10;
            }
        }
        // remove the leading zero
        for (int i: num)
            if (!(sb.length() == 0 && i == 0)) sb.append(i);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
