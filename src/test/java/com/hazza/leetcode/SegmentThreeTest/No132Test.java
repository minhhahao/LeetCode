package com.hazza.leetcode.SegmentThreeTest;

import com.hazza.leetcode.SegmentThree.No132PalindromePartitioningII;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-6
 * Time: 1:29 PM
 */
public class No132Test {
    No132PalindromePartitioningII test;

    @Before
    public void setUp() {
        test = new No132PalindromePartitioningII();
    }

    @Test
    public void test1() {
        String s = "aab";

        assertEquals(1, test.minCut(s));
        assertEquals(1, test.minCut1(s));
    }

    @Test
    public void test2() {
        String s = "abbab";

        assertEquals(1, test.minCut(s));
        assertEquals(1, test.minCut1(s));
    }
}
