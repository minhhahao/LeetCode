package com.hazza.leetcode.SegmentThree;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/valid-palindrome/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-26
 * Time: 5:32 PM
 */
public class No125ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int left = 0, right = s.length() - 1;

        while (left <= right) {
            char head = s.charAt(left);
            char tail = s.charAt(right);
            if (!Character.isLetterOrDigit(head)) ++left;
            else if (!Character.isLetterOrDigit(tail)) --right;
            else {
                if (Character.toLowerCase(head) != Character.toLowerCase(tail)) return false;
                ++left;
                --right;
            }
        }

        return true;
    }

    public boolean isPalindrome1(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}
