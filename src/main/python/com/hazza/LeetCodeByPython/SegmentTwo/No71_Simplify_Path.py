#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-02
# https://leetcode.com/problems/simplify-path/


class Solution:
    def simplifyPath(self, path: str) -> str:
        stack = []
        symbols = path.split('/')

        for s in symbols:
            if s == '..' and len(stack) != 0:
                stack.pop()
            elif s != '.' and s != '' and s != '..':
                stack.append(s)

        return '/' + '/'.join(stack)


if __name__ == '__main__':
    solution = Solution()

    print(solution.simplifyPath('/home/'))

    assert solution.simplifyPath('/home/') == '/home'
    assert solution.simplifyPath('/../') == '/'
    assert solution.simplifyPath('/...') == '/...'
    assert solution.simplifyPath('/home//foo/') == '/home/foo'
    assert solution.simplifyPath('/a/./b/../../c/') == '/c'
    assert solution.simplifyPath('/a/../../b/../c//.//') == '/c'
    assert solution.simplifyPath('/a//b////c/d//././/..') == '/a/b/c'
