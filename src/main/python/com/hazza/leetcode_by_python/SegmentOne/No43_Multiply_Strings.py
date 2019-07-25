#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/5/13 20:00
# https://www.youtube.com/watch?v=-uNIY0STTKA


class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        res = [0] * (len(num1) + len(num2))
        pos = len(res) - 1

        for i in reversed(num1):
            tempPos = pos
            for j in reversed(num2):
                res[tempPos] += int(i) * int(j)
                res[tempPos - 1] += res[tempPos] // 10
                res[tempPos] = res[tempPos] % 10
                tempPos -= 1
            pos -= 1

        i = 0
        # i < len(res) - 1, because in case that res == [0,...,0]
        while i < len(res) - 1 and res[i] == 0:
            i += 1

        return ''.join(map(str, res[i:]))


if __name__ == '__main__':
    solution = Solution()
    print(solution.multiply('2', '3'))
    assert solution.multiply('2', '3') == '6'
    assert solution.multiply('123', '456') == '56088'