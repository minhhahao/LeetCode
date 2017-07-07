package com.hazza.LeetCodeByJava;

/**
 * https://leetcode.com/problems/reverse-integer/?tab=Description
 */
public class No8StringToInteger {
    public int myAtoi(String str) {
        int res = 0, index = 0, sign = 1;
        //空字符串
        if (str.length() == 0) return 0;
        //去除空格
        while (str.charAt(index) == ' ' && index < str.length()) {
            ++index;
        }
        //去除正负号
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }
        while (index < str.length()) {
            int digit = str.charAt(index++) - '0';
            //判断是否是数字
            if (digit < 0 || digit > 9)
                break;
            //判断是否溢出
            if (Integer.MAX_VALUE / 10 < res || Integer.MAX_VALUE / 10 == res && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
        }

        return res * sign;
    }
}
