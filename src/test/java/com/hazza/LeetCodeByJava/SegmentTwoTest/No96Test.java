package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No96UniqueBinarySearchTrees;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-11
 * Time: 10:38 AM
 */
public class No96Test {
    No96UniqueBinarySearchTrees test;

    @Before
    public void setUp() {
        test = new No96UniqueBinarySearchTrees();
    }

    @Test
    public void testSome() {
        assertEquals(5, test.numTrees(3));
        assertEquals(16796, test.numTrees(10));
    }
}
