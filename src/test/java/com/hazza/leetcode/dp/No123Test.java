package com.hazza.leetcode.dp;

import com.hazza.leetcode.dp.No123BestTimeToBuyAndSellStockIII;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-5
 * Time: 5:34 PM
 */
public class No123Test {
    No123BestTimeToBuyAndSellStockIII test;

    @Before
    public void setUp() {
        test = new No123BestTimeToBuyAndSellStockIII();
    }

    @Test
    public void test1() {
        int[] prices = {2, 1, 4};

        assertEquals(3, test.maxProfit(prices));
    }
}
