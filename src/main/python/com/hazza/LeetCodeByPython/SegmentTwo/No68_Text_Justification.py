#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/6/20 20:12
# https://leetcode.com/problems/text-justification/
from typing import List


class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        res, curWords = [], []
        lineLen = 0

        for word in words:
            if lineLen + len(curWords) + len(word) > maxWidth:
                for i in range(maxWidth - lineLen):
                    curWords[i % (len(curWords) - 1 or 1)] += ' '
                res.append(''.join(curWords))
                curWords = []
                lineLen = 0
            curWords.append(word)
            lineLen += len(word)
        res.append(' '.join(curWords).ljust(maxWidth))

        return res


if __name__ == '__main__':
    solution = Solution()

    words = ["This",
             "is",
             "an",
             "example",
             "of",
             "text",
             "justification."]
    expected = [
        "This    is    an",
        "example  of text",
        "justification.  "
    ]
    assert solution.fullJustify(words, 16) == expected

    words = ["What",
             "must",
             "be",
             "acknowledgment",
             "shall",
             "be"]
    expected = [
        "What   must   be",
        "acknowledgment  ",
        "shall be        "
    ]
    assert solution.fullJustify(words, 16) == expected

    words = [
        "Science",
        "is",
        "what",
        "we",
        "understand",
        "well",
        "enough",
        "to",
        "explain",
        "to",
        "a",
        "computer.",
        "Art",
        "is",
        "everything",
        "else",
        "we",
        "do"]
    expected = [
        "Science  is  what we",
        "understand      well",
        "enough to explain to",
        "a  computer.  Art is",
        "everything  else  we",
        "do                  "
    ]
    assert solution.fullJustify(words, 20) == expected
