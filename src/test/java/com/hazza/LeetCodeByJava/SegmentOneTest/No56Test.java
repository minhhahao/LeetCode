package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No56MergeIntervals;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-12
 * Time: 9:23 AM
 */
public class No56Test {
    No56MergeIntervals test;

    private List<No56MergeIntervals.Interval> generateIntervals(int... nums) {
        List<No56MergeIntervals.Interval> res = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++)
            res.add(new No56MergeIntervals.Interval(nums[2 * i], nums[2 * i + 1]));
        return res;
    }

    private String intervals2str(List<No56MergeIntervals.Interval> intervals) {
        StringBuilder sb = new StringBuilder();
        for (No56MergeIntervals.Interval i: intervals)
            sb.append(i.start + " " + i.end + " ");
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No56MergeIntervals();
    }

    @Test
    public void testThree() {
        List<No56MergeIntervals.Interval> intervals
                = generateIntervals(1, 3, 2, 6, 8, 10, 15, 18);
        List<No56MergeIntervals.Interval> right
                = generateIntervals(1, 6, 8, 10, 15, 18);

        assertEquals(intervals2str(right), intervals2str(test.merge(intervals)));
    }

    @Test
    public void testNonSorted() {
        List<No56MergeIntervals.Interval> intervals
                = generateIntervals(1, 4, 0, 4);
        List<No56MergeIntervals.Interval> right
                = generateIntervals(0, 4);

        assertEquals(intervals2str(right), intervals2str(test.merge(intervals)));
    }

    @Test
    public void testRightSmaller() {
        List<No56MergeIntervals.Interval> intervals
                = generateIntervals(1, 4, 2, 3);
        List<No56MergeIntervals.Interval> right
                = generateIntervals(1, 4);

        assertEquals(intervals2str(right), intervals2str(test.merge(intervals)));
    }
}
