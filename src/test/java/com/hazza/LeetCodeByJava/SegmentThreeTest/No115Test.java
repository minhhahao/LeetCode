package com.hazza.LeetCodeByJava.SegmentThreeTest;

import com.hazza.LeetCodeByJava.SegmentThree.No115DistinctSubsequences;
import com.hazza.LeetCodeByJava.util.Utils;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-27
 * Time: 2:20 PM
 */
public class No115Test {
    No115DistinctSubsequences test;

    @Before
    public void setUp() {
        test = new No115DistinctSubsequences();
    }

    @Test
    public void test1() {
        String S = "rabbbit";
        String T = "rabbit";

        assertEquals(3, test.numDistinct(S, T));
        assertEquals(3, test.numDistinct1(S, T));
    }

    @Test
    public void testRandom() {
        int m = 0, n = 0;
        while (m <= n) {
            m = new Random().nextInt(1000) + 1;
            n = new Random().nextInt(10) + 1;
        }

        String S = Utils.getRandomStr(m);
        String T = Utils.getRandomStr(n);
        System.out.println("S: " + S);
        System.out.println("T: " + T);
        System.out.println(test.numDistinct(S, T));
        assertEquals(test.numDistinct(S, T), test.numDistinct1(S, T));
    }
}
