#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-31
import unittest

from src.main.python.leetcode_by_python.dp.No91_Decode_Ways import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        assert self.solution.numDecodings("10") == 1
        assert self.solution.numDecodings("12") == 2
        assert self.solution.numDecodings("226") == 3


if __name__ == '__main__':
    unittest.main()