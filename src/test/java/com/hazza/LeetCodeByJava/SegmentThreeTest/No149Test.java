package com.hazza.LeetCodeByJava.SegmentThreeTest;

import com.hazza.LeetCodeByJava.SegmentThree.No149MaxPointsOnALine;
import com.hazza.LeetCodeByJava.datastructure.Point;
import com.hazza.LeetCodeByJava.datastructure.RandomListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-4
 * Time: 8:25 AM
 */
public class No149Test {
    No149MaxPointsOnALine test;

    private int gcdRec(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcdRec(b, a % b);
        }
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }

    @Before
    public void setUp() {
        test = new No149MaxPointsOnALine();
    }

    @Test
    public void testGcd() {
        Random random = new Random();

        int a = random.nextInt(100000);
        int b = random.nextInt(100000);

        assertEquals(gcdRec(a, b), gcd(a, b));
    }

    @Test
    public void test() {
        Point[] points = new Point[3];

        points[0] = new Point(4, 0);
        points[1] = new Point(4, -1);
        points[2] = new Point(4, 5);

        assertEquals(3, test.maxPoints(points));
    }
}
