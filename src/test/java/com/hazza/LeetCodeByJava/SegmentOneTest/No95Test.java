package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No95UniqueBinarySearchTreesII;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-10
 * Time: 10:14 AM
 */
public class No95Test {
    No95UniqueBinarySearchTreesII test;

    @Before
    public void setUp() {
        test = new No95UniqueBinarySearchTreesII();
    }

    @Test
    public void testThree() {
        assertEquals(test.generateTrees1(3).size(), test.generateTrees(3).size());
    }
}
