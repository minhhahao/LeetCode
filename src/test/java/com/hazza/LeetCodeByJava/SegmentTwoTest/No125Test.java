package com.hazza.LeetCodeByJava.SegmentTwoTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No125ValidPalindrome;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-26
 * Time: 5:50 PM
 */
public class No125Test {
    No125ValidPalindrome test;

    @Before
    public void setUp() {
        test = new No125ValidPalindrome();
    }

    @Test
    public void testEmpty() {
        String s = ",.";

        assertEquals(true, test.isPalindrome1(s));
    }

    @Test
    public void testLong() {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        assertEquals(true, test.isPalindrome(s1));
        assertEquals(true, test.isPalindrome1(s1));
        assertEquals(false, test.isPalindrome(s2));
        assertEquals(false, test.isPalindrome1(s2));
    }
}
