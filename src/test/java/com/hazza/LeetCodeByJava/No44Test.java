package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hazza on 8/7/17.
 */
public class No44Test {
    No44WildcardMatching test;

    @Before
    public void setUp() {
        test = new No44WildcardMatching();
    }

    @Test
    public void testEmpty() {
        String str1 = "";
        String str2 = "?*";
        assertEquals(false, test.isMatch(str1, str2));
    }

    @Test
    public void testSingle() {
        
        String str1 = "aa";
        String str2 = "a";
        assertEquals(false, test.isMatch(str1, str2));
    }

    @Test
    public void testSame() {
        
        String str1 = "aa";
        String str2 = "aa";
        assertEquals(true, test.isMatch(str1, str2));
    }

    @Test
    public void testShorter() {
        
        String str1 = "aaa";
        String str2 = "aa";
        assertEquals(false, test.isMatch(str1, str2));
    }

    @Test
    public void testAsterisk() {
        
        String str1 = "aa";
        String str2 = "a*";
        String str3 = "*";
        assertEquals(true, test.isMatch(str1, str2));
        assertEquals(true, test.isMatch(str1, str3));
    }

    @Test
    public void testPeroidAndAsterisk() {
        
        String str1 = "aa";
        String str2 = "ab";
        String str3 = "?*";
        assertEquals(true, test.isMatch(str1, str3));
        assertEquals(true, test.isMatch(str2, str3));
    }

    @Test
    public void testLonger() {
        
        String str1 = "aab";
        String str2 = "c*a*b";
        String str3 = "ab";
        String str4 = "?*c";
        assertEquals(false, test.isMatch(str1, str2));
        assertEquals(false, test.isMatch(str3, str4));
    }
}
