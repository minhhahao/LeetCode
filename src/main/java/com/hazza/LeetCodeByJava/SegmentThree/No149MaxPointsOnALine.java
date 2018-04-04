package com.hazza.LeetCodeByJava.SegmentThree;

import com.hazza.LeetCodeByJava.datastructure.Point;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/max-points-on-a-line/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-3
 * Time: 8:47 AM
 */
public class No149MaxPointsOnALine {

    private int gcd(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }

    public int maxPoints(Point[] points) {
        int len = points.length;
        if (len <= 2) {
            return len;
        }
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        int res = 0;
        for (int i = 0; i < len; ++i) {
            map.clear();
            int max = 0, overlap = 0;
            for (int j = i + 1; j < len; ++j) {
                int x = points[j].x - points[i].x;
                int y = points[j].y - points[i].y;

                if (x == 0 && y == 0) {
                    ++overlap;
                    continue;
                }

                int gcd = gcd(x, y);
                if (gcd != 0) {
                    x /= gcd;
                    y /= gcd;
                }

                if (map.containsKey(x)) {
                    if (map.get(x).containsKey(y)) {
                        map.get(x).put(y, map.get(x).get(y) + 1);
                    } else {
                        map.get(x).put(y, 1);
                    }
                } else {
                    Map<Integer, Integer> m = new HashMap<>();
                    m.put(y, 1);
                    map.put(x, m);
                }

                max = Math.max(max, map.get(x).get(y));
            }

            res = Math.max(res, max + overlap + 1);
        }

        return res;
    }

}
