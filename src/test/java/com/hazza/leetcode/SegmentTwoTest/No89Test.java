package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No89GrayCode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-26
 * Time: 10:29 AM
 */
public class No89Test {
    No89GrayCode test;

    private String list2str(List<Integer> l) {
        StringBuffer sb = new StringBuffer();
        for (Integer i: l) sb.append(i + " ");
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No89GrayCode();
    }

    @Test
    public void testGray() {
        List right = Arrays.asList(0, 1, 3, 2);
        assertEquals(list2str(right), list2str(test.grayCode(2)));
    }

}
