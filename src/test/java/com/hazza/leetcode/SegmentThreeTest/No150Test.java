package com.hazza.leetcode.SegmentThreeTest;

import com.hazza.leetcode.SegmentThree.No150EvaluateReversePolishNotation;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-6
 * Time: 10:53 AM
 */
public class No150Test {
    No150EvaluateReversePolishNotation test;

    @Before
    public void setUp() {
        test = new No150EvaluateReversePolishNotation();
    }

    @Test
    public void test1() {
        String[] tokons = {"2", "1", "+", "3", "*"};

        assertEquals(9, test.evalRPN(tokons));
    }

    @Test
    public void test2() {
        String[] tokons = {"4", "13", "5", "/", "+"};

        assertEquals(6, test.evalRPN(tokons));
    }
}
