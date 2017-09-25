package com.hazza.LeetCodeByJava;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/merge-sorted-array/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-25
 * Time: 9:02 AM
 */
public class No88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = m + n, i = m - 1, j = n - 1;
        while (count > 0)
            if (j < 0 || (i >= 0 && nums1[i] >= nums2[j])) nums1[--count] = nums1[i--];
            else nums1[--count] = nums2[j--];
    }
}
