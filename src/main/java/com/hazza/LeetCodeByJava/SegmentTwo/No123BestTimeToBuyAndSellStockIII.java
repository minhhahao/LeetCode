package com.hazza.LeetCodeByJava.SegmentTwo;

import org.omg.CORBA.INTERNAL;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-5
 * Time: 3:43 PM
 */
public class No123BestTimeToBuyAndSellStockIII {

    // solution 1
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int len = prices.length;
        int[] dp = new int[len];

        int k = 2; // the number of transactions at most
        for (int i = 0; i < k; i++) {
            int tmpMax = -prices[0];
            for (int j = 1; j < len; j++) {
                int prev = dp[j];
                dp[j] = Math.max(dp[j - 1], prices[j] + tmpMax);
                tmpMax = Math.max(tmpMax, prev - prices[j]);
            }
        }

        return dp[len - 1];
    }

    // solution 2
    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE, sell1 = 0, sell2 = 0;

        for (int price: prices) {
            sell2 = Math.max(sell2, buy2 + price);
            buy2 = Math.max(buy2, sell1 - price);
            sell1 = Math.max(sell1, buy1 + price);
            buy1 = Math.max(buy1, -price);
        }

        return sell2;
    }
    
}
