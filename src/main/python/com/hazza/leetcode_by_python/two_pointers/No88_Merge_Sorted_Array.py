#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-26
# https://leetcode.com/problems/merge-sorted-array/
from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i, j, cur = m - 1, n - 1, m + n - 1

        while cur >= 0:
            if j < 0 or (i >= 0 and nums1[i] > nums2[j]):
                nums1[cur] = nums1[i]
                i -= 1
            else:
                nums1[cur] = nums2[j]
                j -= 1
            cur -= 1


if __name__ == '__main__':
    solution = Solution()

    nums1 = [1, 2, 3, 0, 0, 0]
    nums2 = [2, 5, 6]
    solution.merge(nums1, 3, nums2, 3)
    assert nums1 == [1, 2, 2, 3, 5, 6]
