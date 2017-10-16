package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No22GenerateParentheses;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class No22Test {

    @Test
    public void testEmpty() {
        No22GenerateParentheses test = new No22GenerateParentheses();

        assertEquals(new ArrayList<>(), test.generateParenthesis(0));
    }

    @Test
    public void testMatching() {
        String[] strs = {"((()))", "(()())", "(())()", "()(())", "()()()"};
        List<String> example = new ArrayList<String>();
        for (String str: strs) example.add(str);
        No22GenerateParentheses test = new No22GenerateParentheses();
        List<String> res = test.generateParenthesis(3);
        Collections.sort(example);
        Collections.sort(res);

        assertEquals(example, res);
    }
}
