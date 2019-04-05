package com.hazza.Leetfbc6539b3310ff0a3c03f3f29f8fbd987c2dbd7fCodeByJava.SegmentOne;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/#/description
 */
public class No5LongestPalindromicSubstring {
    //Solution 1
    private int maxLen,lo;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); ++i) {
            extendPalindrome(s, i, i);	//odd length
            extendPalindrome(s, i, i + 1);	//even length
        }

        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            --start;
            ++end;
        }
        if (maxLen < end - start - 1) {
            lo = start + 1;
            maxLen = end - start - 1;
        }
    }

    //solution2
    public String longestPalindrome2(String s) {
        String res = "";
        int currLength = 0;
        for(int i = 0; i < s.length(); i++){
            if(isPalindrome(s, i - currLength - 1, i)){
                res = s.substring(i - currLength - 1, i + 1);
                currLength = currLength + 2;
            }
            else if(isPalindrome(s, i - currLength, i)){
                res = s.substring(i - currLength, i + 1);
                currLength = currLength + 1;
            }
        }
        return res;
    }

    public boolean isPalindrome(String s, int begin, int end){
        if(begin < 0) return false;
        while(begin < end){
            if(s.charAt(begin++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
