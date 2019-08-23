#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-23
import unittest

from src.main.python.leetcode_by_python.dp.No97_Interleaving_String import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        self.assertEqual(self.solution.isInterleave('aabcc', 'dbbca', 'aadbbcbcac'), True)
        self.assertEqual(self.solution.isInterleave('aabcc', 'dbbca', 'aadbbbaccc'), False)


if __name__ == '__main__':
    unittest.main()
