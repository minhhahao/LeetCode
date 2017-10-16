package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No71SimplifyPath;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-24
 * Time: 9:53 AM
 */
public class No71Test {
    No71SimplifyPath test;

    @Before
    public void setUp() {
        test = new No71SimplifyPath();
    }

    @Test
    public void testRedundant() {
        assertEquals("/home/foo", test.simplifyPath("/home//foo/"));
        assertEquals("/home", test.simplifyPath("/home/"));
    }

    @Test
    public void testComplex() {
        assertEquals("/c", test.simplifyPath("/a/./b/../../c/"));
        assertEquals("/abc/...", test.simplifyPath("/abc/..."));
    }
}
