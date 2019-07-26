package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No72EditDistance;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-25
 * Time: 9:54 AM
 */
public class No72Test {
    No72EditDistance test;

    private String createRandomStr(int num) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < num; i++)
            sb.append((char)(random.nextInt(26) + 97));
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No72EditDistance();
    }

    @Test
    public void testSingle() {
        assertEquals(0, test.minDistance1("a", "a"));
    }

    @Test
    public void testRandom() {
        String word1 = createRandomStr(142);
        String word2 = createRandomStr(56);
        System.out.println(word1);
        System.out.println(word2);
        assertEquals(test.minDistance(word1, word2), test.minDistance1(word1, word2));
    }
}
