package com.hazza.leetcode.SegmentThree;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-3
 * Time: 6:00 PM
 */
public class No121BestTimeToBuyAndSellStock {

    // solution 1
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int len = prices.length;
        int[] change = new int[len - 1];
        for (int i = 0; i < len - 1; i++) change[i] = prices[i + 1] - prices[i];
        int res = findMaxSubarray(change, 0, len - 2);

        return (res < 0) ? 0 : res;
    }

    private int findMaxSubarray(int[] change, int low, int high) {
        if (low == high) return change[low];

        int mid = (high - low) / 2 + low;
        int left = findMaxSubarray(change, low, mid);
        int right = findMaxSubarray(change, mid + 1, high);
        int cross = findMaxCrossingSubarray(change, low, mid, high);

        return Math.max(cross, Math.max(left, right));
    }

    private int findMaxCrossingSubarray(int[] change, int low, int mid, int high) {
        int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;

        for (int i = mid, sum = 0; i >= low; i--) {
            sum += change[i];
            leftMax = (leftMax > sum) ? leftMax : sum;
        }

        for (int i = mid + 1, sum = 0; i <= high; i++) {
            sum += change[i];
            rightMax = (rightMax > sum) ? rightMax : sum;
        }

        return leftMax + rightMax;
    }

    // solution 2
    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int len = prices.length;
        int[] change = new int[len - 1];
        for (int i = 0; i < len - 1; i++) change[i] = prices[i + 1] - prices[i];

        int max = Integer.MIN_VALUE;
        for (int i = 0, temp = 0; i < len - 1; i++) {
            temp += change[i];
            if (temp < 0) temp = 0;
            if (temp > max) max = temp;
        }

        return (max < 0) ? 0 : max;
    }

}
