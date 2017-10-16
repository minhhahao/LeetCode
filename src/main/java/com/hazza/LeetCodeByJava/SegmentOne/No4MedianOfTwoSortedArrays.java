package com.hazza.LeetCodeByJava.SegmentOne;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/#/description
 */
public class No4MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        //若m+n为奇数，则l=r
        //若m+n为偶数，则l为偏左的中位数，r为偏右的中位数
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (findKth(A, 0, B, 0, l) + findKth(A, 0, B, 0, r)) / 2.0;
    }

    private double findKth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart > A.length - 1) return B[bStart + k - 1];	//A为空或A的最大元素小于B[bStart]
        if (bStart > B.length - 1) return A[aStart + k - 1];	//B为空或B的最大元素小于A[aStart]
        if (k == 1) return Math.min(A[aStart], B[bStart]);	//k=1,只剩一个数字，取小的

        //防止A或B数组过短
        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1];
        if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];

        if (aMid < bMid) return findKth(A, aStart + k/2, B, bStart, k - k/2);
        else return findKth(A, aStart, B, bStart + k/2, k - k/2);
    }
}
