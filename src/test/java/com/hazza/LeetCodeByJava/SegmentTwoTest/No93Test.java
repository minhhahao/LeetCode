package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No93RestoreIPAddresses;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-05
 * Time: 9:21 PM
 */
public class No93Test {
    No93RestoreIPAddresses test;

    private String strList2Str(List<String> l) {
        Collections.sort(l);
        StringBuffer sb = new StringBuffer();
        for (String s: l) sb.append(s + " ");

        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No93RestoreIPAddresses();
    }

    @Test
    public void testOne() {
        String s = "1111";
        List<String> right = Arrays.asList("1.1.1.1");
        assertEquals(strList2Str(right), strList2Str(test.restoreIpAddresses(s)));
    }

    @Test
    public void testComplex() {
        String s = "25525511135";
        List<String> right = Arrays.asList("255.255.11.135", "255.255.111.35");
        assertEquals(strList2Str(right), strList2Str(test.restoreIpAddresses(s)));
    }

}
