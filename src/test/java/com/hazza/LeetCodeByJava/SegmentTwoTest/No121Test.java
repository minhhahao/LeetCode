package com.hazza.LeetCodeByJava.SegmentTwoTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No121BestTimeToBuyAndSellStock;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-3
 * Time: 6:36 PM
 */
public class No121Test {
    No121BestTimeToBuyAndSellStock test;

    @Before
    public void setUp() {
        test = new No121BestTimeToBuyAndSellStock();
    }

    @Test
    public void testOne() {
        int[] prices = {1};

        assertEquals(0, test.maxProfit(prices));
        assertEquals(0, test.maxProfit1(prices));
    }

    @Test
    public void testRise() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        assertEquals(5, test.maxProfit(prices));
        assertEquals(5, test.maxProfit1(prices));
    }

    @Test
    public void testDrop() {
        int[] prices = {7, 6, 4, 3, 1};

        assertEquals(0, test.maxProfit(prices));
        assertEquals(0, test.maxProfit1(prices));
    }
}
