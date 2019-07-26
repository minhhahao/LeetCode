package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No57InsertInterval;
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
 * Date: 2017-08-13
 * Time: 8:38 AM
 */
public class No57Test {
    No57InsertInterval test;

    private List<No57InsertInterval.Interval> generateIntervals(int... nums) {
        List<No57InsertInterval.Interval> res = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++)
            res.add(new No57InsertInterval.Interval(nums[2 * i], nums[2 * i + 1]));
        return res;
    }

    private String intervals2str(List<No57InsertInterval.Interval> intervals) {
        StringBuilder sb = new StringBuilder();
        for (No57InsertInterval.Interval i: intervals)
            sb.append(i.start + " " + i.end + " ");
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No57InsertInterval();
    }

    @Test
    public void testTwo() {
        List<No57InsertInterval.Interval> intervals
                = generateIntervals(1, 3, 6, 9);
        No57InsertInterval.Interval interval = new No57InsertInterval.Interval(2, 5);
        List<No57InsertInterval.Interval> right
                = generateIntervals(1, 5, 6, 9);

        assertEquals(intervals2str(right), intervals2str(test.insert(intervals, interval)));
    }

    @Test
    public void testFive() {
        List<No57InsertInterval.Interval> intervals
                = generateIntervals(1, 2, 3, 5, 6, 7, 8, 10, 12, 16);
        No57InsertInterval.Interval interval = new No57InsertInterval.Interval(4, 9);
        List<No57InsertInterval.Interval> right
                = generateIntervals(1, 2, 3, 10, 12, 16);

        assertEquals(intervals2str(right), intervals2str(test.insert(intervals, interval)));
    }

//    @Test
//    public void testNonSorted() {
//        List<No57InsertInterval.Interval> intervals
//                = generateIntervals(1, 4, 0, 4);
//        List<No57InsertInterval.Interval> right
//                = generateIntervals(0, 4);
//
//        assertEquals(intervals2str(right), intervals2str(test.merge(intervals)));
//    }

//    @Test
//    public void testRightSmaller() {
//        List<No57InsertInterval.Interval> intervals
//                = generateIntervals(1, 4, 2, 3);
//        List<No57InsertInterval.Interval> right
//                = generateIntervals(1, 4);
//
//        assertEquals(intervals2str(right), intervals2str(test.merge(intervals)));
//    }
}
