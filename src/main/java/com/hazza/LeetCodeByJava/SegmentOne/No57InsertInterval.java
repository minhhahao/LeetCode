package com.hazza.LeetCodeByJava.SegmentOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/insert-interval/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-13
 * Time: 8:21 AM
 */
public class No57InsertInterval {
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    // solution 1
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        if (intervals == null || intervals.size() == 1) return intervals;

        return merge(intervals);
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        int len = intervals.size();
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 0; i < len; i++) {
            left[i] = intervals.get(i).start;
            right[i] = intervals.get(i).end;
        }
        Arrays.sort(left);
        Arrays.sort(right);
        for (int i = 0, j = 0; i < len; i++) {
            if (i == len - 1 || left[i + 1] > right[i]) {
                res.add(new Interval(left[j], right[i]));
                j = i + 1;
            }
        }

        return res;
    }

    // solution 2
    public List<Interval> insert2(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) return intervals;
        if (intervals == null || intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        List<Interval> res = new ArrayList<>();
        int i = 0, len = intervals.size();
        while (i < len && intervals.get(i).end < newInterval.start)
            res.add(intervals.get(i++));
        while (i < len && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            ++i;
        }
        res.add(newInterval);
        while (i < len) res.add(intervals.get(i++));

        return res;
    }
}
