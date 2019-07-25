#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/3 21:15
# https://leetcode.com/problems/count-and-say/


class Solution:
    def countAndSay1(self, n: int) -> str:
        if n == 1:
           return '1'
        res = self.countAndSay1(n - 1)
        newRes = ''
        cnt = 1

        for i in range(1, len(res)):
            if res[i] != res[i - 1]:
                newRes += str(cnt) + res[i - 1]
                cnt = 1
            else:
                cnt += 1
        newRes += str(cnt) + res[-1]

        return newRes

    def countAndSay2(self, n: int) -> str:
        res = '1'

        for _ in range(1, n):
            cnt = 1
            newRes = ''
            for i in range(1, len(res)):
                if res[i] != res[i - 1]:
                    newRes += str(cnt) + res[i - 1]
                    cnt = 1
                else:
                    cnt += 1
            newRes += str(cnt) + res[-1]
            res = newRes

        return res


if __name__ == '__main__':
    solution = Solution()

    assert solution.countAndSay1(1) == '1'
    assert solution.countAndSay1(2) == '11'
    assert solution.countAndSay1(3) == '21'
    assert solution.countAndSay1(4) == '1211'
    assert solution.countAndSay1(5) == '111221'

    assert solution.countAndSay2(1) == '1'
    assert solution.countAndSay2(2) == '11'
    assert solution.countAndSay2(3) == '21'
    assert solution.countAndSay2(4) == '1211'
    assert solution.countAndSay2(5) == '111221'