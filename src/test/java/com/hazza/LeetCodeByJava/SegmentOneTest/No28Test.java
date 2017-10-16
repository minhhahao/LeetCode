package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No28ImplementStrStr;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/14/17.
 */
public class No28Test {

    @Test
    public void testEmpty() {
        No28ImplementStrStr test = new No28ImplementStrStr();
        String s1 = "", s2 = "";
        assertEquals(0, test.strStr(s1, s2));
    }

    @Test
    public void testMatch() {
        No28ImplementStrStr test = new No28ImplementStrStr();
        String s1 = "abcasdcas", s2 = "cas";
        assertEquals(2, test.strStr(s1, s2));
    }

    @Test
    public void testTooLong() {
        No28ImplementStrStr test = new No28ImplementStrStr();
        String s1 = "abcdefg", s2 = "efgh";
        assertEquals(-1, test.strStr(s1, s2));
    }
}
