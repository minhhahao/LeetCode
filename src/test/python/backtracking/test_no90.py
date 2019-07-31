#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-30
import unittest

from src.main.python.leetcode_by_python.backtracking.No90_Subsets_II import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        expected = [
            [2],
            [1],
            [1, 2, 2],
            [2, 2],
            [1, 2],
            []
        ]

        res1 = self.solution.subsetsWithDup1([1, 2, 2])
        assert sorted(res1) == sorted(expected)

        res2 = self.solution.subsetsWithDup2([1, 2, 2])
        assert sorted(res2) == sorted(expected)


if __name__ == '__main__':
    unittest.main()
