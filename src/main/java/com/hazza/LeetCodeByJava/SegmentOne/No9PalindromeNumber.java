package com.hazza.LeetCodeByJava.SegmentOne;

/**
 * https://leetcode.com/problems/palindrome-number/#/description
 */
public class No9PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;   //舍弃负数和个位是0的数字
        int y = 0;
        while (x > y) { //防止溢出
            y = y * 10 + x % 10;
            x /= 10;
        }
        return (x == y || x == y / 10); //前一个条件为了x是偶数，后一个条件为了x使奇数
    }
}
