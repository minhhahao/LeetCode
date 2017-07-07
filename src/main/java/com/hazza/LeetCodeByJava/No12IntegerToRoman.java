package com.hazza.LeetCodeByJava;

/**
 * https://leetcode.com/problems/integer-to-roman/#/description
 */
public class No12IntegerToRoman {
    public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};    //千分位
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};   //百分位
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};   //十分位
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};   //个位数
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
}
