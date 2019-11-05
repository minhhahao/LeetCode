#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-11-05
import unittest

from src.main.python.leetcode_by_python.array.No119_Pascals_Triangle_II import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        expected = [1, 3, 3, 1]
        res = self.solution.getRow(3)
        self.assertEqual(expected, res)


if __name__ == '__main__':
    unittest.main()
