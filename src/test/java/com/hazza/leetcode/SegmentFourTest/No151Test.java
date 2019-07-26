package com.hazza.leetcode.SegmentFourTest;

import com.hazza.leetcode.SegmentFour.No151ReverseWordsInAString;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-7
 * Time: 10:11 AM
 */
public class No151Test {
    No151ReverseWordsInAString test;

    @Before
    public void setUp() {
        test = new No151ReverseWordsInAString();
    }

    @Test
    public void test() {
        String s = "the sky is blue";

        String expected = "blue is sky the";

        assertEquals(expected, test.reverseWords(s));
        assertEquals(expected, test.reverseWords1(s));
    }

    @Test
    public void testAllSpaces() {
        String s = "  ";

        String expected = "";

        assertEquals(expected, test.reverseWords(s));
        assertEquals(expected, test.reverseWords1(s));
    }
}
