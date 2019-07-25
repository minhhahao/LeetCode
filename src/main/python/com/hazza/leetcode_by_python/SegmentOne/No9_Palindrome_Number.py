#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/7 21:43
# https://leetcode.com/problems/palindrome-number/


class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or x != 0 and x % 10 == 0:
            return False
        y = 0
        while x > y:
            x, tail = divmod(x, 10)
            y = y * 10 + tail

        return x == y or int(y / 10) == x


if __name__ == '__main__':
    solution = Solution()
    assert solution.isPalindrome(121) == True
    assert solution.isPalindrome(-121) == False
    assert solution.isPalindrome(10) == False
