#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019/4/4 21:32
# https://leetcode.com/problems/median-of-two-sorted-arrays/
import sys
from typing import List


class Solution:
    def findKth(self, nums1, m, start1, nums2, n, start2, k):
        if start1 >= m:
            return nums2[start2 + k -1]
        if start2 >= n:
            return nums1[start1 + k - 1]
        if k == 1:
            return min(nums1[start1], nums2[start2])

        mid1 = sys.maxsize
        mid2 = sys.maxsize
        half = int(k / 2)
        if start1 + half - 1 < m:
            mid1 = nums1[start1 + half - 1]
        if start2 + half - 1 < n:
            mid2 = nums2[start2 + half - 1]

        if mid1 < mid2:
            return self.findKth(nums1, m, start1 + half, nums2, n, start2, k - half)
        else:
            return self.findKth(nums1, m, start1, nums2, n, start2 + half, k - half)

    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m = len(nums1)
        n = len(nums2)
        l = int((m + n + 1) / 2)
        r = int((m + n + 2) / 2)

        return (self.findKth(nums1, m, 0, nums2, n, 0, l) + self.findKth(nums1, m, 0, nums2, n, 0, r)) / 2.0


if __name__ == '__main__':
    solution = Solution()
    assert solution.findMedianSortedArrays([1, 3], [2]) == 2.0
    assert solution.findMedianSortedArrays([1, 2], [3, 4]) == 2.5
