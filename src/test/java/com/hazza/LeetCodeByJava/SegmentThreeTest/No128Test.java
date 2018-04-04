package com.hazza.LeetCodeByJava.SegmentThreeTest;

import com.hazza.LeetCodeByJava.SegmentThree.No128LongestConsecutiveSequence;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-2
 * Time: 2:27 PM
 */
public class No128Test {
    No128LongestConsecutiveSequence test;

    @Before
    public void setUp() {
        test = new No128LongestConsecutiveSequence();
    }

    @Test
    public void test() {
        int[] nums = {100, 4, 200, 1, 3, 2};

        assertEquals(4, test.longestConsecutive(nums));
        assertEquals(4, test.longestConsecutive1(nums));
    }
}
