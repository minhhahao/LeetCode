package com.hazza.leetcode.datastructure;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-11
 * Time: 9:29 PM
 */
public class SegmentTree {
    private SegmentTree() {}

    private static int minVal(int[] arr, int i, int j) {
        if (i == -1) return j;
        if (j == -1) return i;
        return (arr[i] < arr[j] ? i : j);
    }

    public static int RMQ(int[] arr, int[] st, int qs, int qe) {
        int n = arr.length - 1;
        if (qs < 0 || qe > n || qs > qe) return -1;
        return RMQUtil(arr, st, 0, n, qs, qe, 0);
    }

    private static int RMQUtil(int[] arr, int[] st, int ss, int se, int qs, int qe, int index) {
        if (qs <= ss && qe >= se) return st[index];
        if (qs > se || qe < ss) return -1;
        int mid = (ss + se) / 2;

        return minVal(arr, RMQUtil(arr, st, ss, mid, qs, qe, 2 * index + 1),
                RMQUtil(arr, st, mid + 1, se, qs, qe, 2 * index + 2));
    }

    public static int[] constructST(int[] arr) {
        int x = (int) (Math.ceil(Math.log(arr.length) / Math.log(2)));
        int maxSize = 2 * (int) Math.pow(2, x)- 1;

        int[] st = new int[maxSize];
        constructSTUtil(arr, st, 0, arr.length - 1, 0);

        return st;
    }

    private static int constructSTUtil(int[] arr, int[] st, int ss, int se, int si) {
        if (ss == se) return (st[si] = ss);
        int mid = (ss + se) / 2;
        st[si] = minVal(arr, constructSTUtil(arr, st, ss, mid, 2 * si + 1),
                constructSTUtil(arr, st, mid + 1, se, 2 * si + 2));

        return st[si];
    }
}
