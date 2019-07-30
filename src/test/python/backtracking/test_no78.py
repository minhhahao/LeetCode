#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-30
import unittest

from src.main.python.leetcode_by_python.backtracking.No78_Subsets import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        input = [1, 2, 3]
        expected = sorted([
            [3],
            [1],
            [2],
            [1, 2, 3],
            [1, 3],
            [2, 3],
            [1, 2],
            []
        ])

        assert sorted(self.solution.subsets1(input)) == expected
        assert sorted(self.solution.subsets2(input)) == expected
        assert sorted(self.solution.subsets3(input)) == expected


if __name__ == '__main__':
    unittest.main()
