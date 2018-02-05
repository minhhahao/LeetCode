package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-5
 * Time: 3:43 PM
 */
public class No123BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE, sell1 = 0, sell2 = 0;

        for (int i: prices) {
            buy1 = Math.min(buy1, i);
            sell1 = Math.max(sell1, i - buy1);
            buy2 = Math.min(buy2, sell1 - i);
            sell2 = Math.max(sell2, i + buy2);
        }

        return sell2;
    }

}
