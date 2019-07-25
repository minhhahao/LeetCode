#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/25 20:48
# https://leetcode.com/problems/substring-with-concatenation-of-all-words/
from typing import List


class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        res = []
        if s == '' or words == []:
            return res
        strLen, wordLen, wordsNum = len(s), len(words[0]), len(words)
        if strLen < wordLen * wordsNum:
            return res
        last = strLen - wordLen + 1
        wordsMap = {}
        table = [[0] * wordsNum for _ in range(2)]
        occur = [-1] * last

        idx, cnt = -1, 0
        for word in words:
            v = wordsMap.get(word, idx + 1)
            if v > idx:
                idx += 1
                cnt += 1
                wordsMap[word] = idx
            table[0][v] += 1

        for i in range(last):
            v = wordsMap.get(s[i:i + wordLen], -1)
            occur[i] = v

        for i in range(wordLen):
            l = r = i
            curCnt = cnt
            table[1] = [0] * wordsNum
            while r < last:
                while curCnt > 0 and r < last:
                    idx = occur[r]
                    if idx != -1:
                        table[1][idx] += 1
                        if table[1][idx] == table[0][idx]:
                            curCnt -= 1
                    r += wordLen
                while curCnt == 0 and l < r:
                    idx = occur[l]
                    if idx != -1:
                        table[1][idx] -= 1
                        if table[1][idx] == table[0][idx] - 1:
                            curCnt += 1
                            if int((r - l) / wordLen) == wordsNum:
                                res.append(l)
                    l += wordLen

        return res


if __name__ == '__main__':
    solution = Solution()
    print(solution.findSubstring('barfoothefoobarman', ["foo", "bar"]))
    assert solution.findSubstring('barfoothefoobarman', ["foo", "bar"]) == [0, 9]
    assert solution.findSubstring('wordgoodgoodgoodbestword', ["word", "good", "best", "word"]) == []