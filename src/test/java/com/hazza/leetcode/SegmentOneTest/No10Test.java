package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No10RegularExpressionMatching;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by hazza on 7/8/17.
 */
public class No10Test {

    @Test
    public void testEmpty() {
        No10RegularExpressionMatching test = new No10RegularExpressionMatching();
        String str1 = "";
        String str2 = ".*";
        assertEquals(false, test.isMatch(str1, str2));
    }

    @Test
    public void testSingle() {
        No10RegularExpressionMatching test = new No10RegularExpressionMatching();
        String str1 = "aa";
        String str2 = "a";
        assertEquals(false, test.isMatch(str1, str2));
    }

    @Test
    public void testSame() {
        No10RegularExpressionMatching test = new No10RegularExpressionMatching();
        String str1 = "aa";
        String str2 = "aa";
        assertEquals(true, test.isMatch(str1, str2));
    }

    @Test
    public void testShorter() {
        No10RegularExpressionMatching test = new No10RegularExpressionMatching();
        String str1 = "aaa";
        String str2 = "aa";
        assertEquals(false, test.isMatch(str1, str2));
    }

    @Test
    public void testAsterisk() {
        No10RegularExpressionMatching test = new No10RegularExpressionMatching();
        String str1 = "aa";
        String str2 = "a*";
        assertEquals(true, test.isMatch(str1, str2));
    }

    @Test
    public void testPeroidAndAsterisk() {
        No10RegularExpressionMatching test = new No10RegularExpressionMatching();
        String str1 = "aa";
        String str2 = "ab";
        String str3 = ".*";
        assertEquals(true, test.isMatch(str1, str3));
        assertEquals(true, test.isMatch(str2, str3));
    }

    @Test
    public void testLonger() {
        No10RegularExpressionMatching test = new No10RegularExpressionMatching();
        String str1 = "aab";
        String str2 = "c*a*b";
        String str3 = "ab";
        String str4 = ".*c";
        assertEquals(true, test.isMatch(str1, str2));
        assertEquals(false, test.isMatch(str3, str4));
    }
}
