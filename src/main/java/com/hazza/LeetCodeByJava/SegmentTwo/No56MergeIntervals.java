package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/merge-intervals/description/
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-12
 * Time: 8:48 AM
 */
public class No56MergeIntervals {
    public static class Interval{
      public int start;
      public int end;
      public Interval() { start = 0; end = 0; }
      public Interval(int s, int e) { start = s; end = e; }

    }

    // solution 1
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) return intervals;
        // lambda
//        intervals.sort(Comparator.comparingInt(i3 -> i3.start));
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                if (i1.start != i2.start) return i1.start - i2.start;
                return i1.end - i2.end;
            }
        });
        List<Interval> res = new ArrayList<>();
        int start = intervals.get(0).start, end = intervals.get(0).end;
        for (Interval interval: intervals) {
            if (end >= interval.start)
                end = Math.max(end, interval.end);
            else {
                res.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }

        res.add(new Interval(start, end));

        return res;
    }

    // solution 2
    public List<Interval> merge1(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) return intervals;
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
}
