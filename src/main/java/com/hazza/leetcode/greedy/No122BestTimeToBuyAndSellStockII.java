package com.hazza.leetcode.greedy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-4
 * Time: 7:19 PM
 */
public class No122BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int res = 0, len = prices.length;

        for (int i = 0; i < len - 1; i++)
            if (prices[i + 1] > prices[i]) res += prices[i + 1] - prices[i];

        return res;
    }
}
