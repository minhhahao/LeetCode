package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No20ValidParentheses;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by hazza on 7/6/17.
 */
public class No20Test {
    @Test
    public void testComplexString() {
        No20ValidParentheses test = new No20ValidParentheses();
        String s = "{aa[sds](assd){sss}(ss)}";
        assertEquals(true, test.isValid(s));
    }

    @Test
    public void testCrossedBrackets() {
        No20ValidParentheses test = new No20ValidParentheses();
        String s = "s{sad}{([sad)}";
        assertEquals(false, test.isValid(s));
    }

    @Test
    public void testRedundantBrackets() {
        No20ValidParentheses test = new No20ValidParentheses();
        String s = "[(sss)";
        assertEquals(false, test.isValid(s));
    }

    @Test
    public void testAbsentBrackets() {
        No20ValidParentheses test = new No20ValidParentheses();
        String s = "s{sad}(sad)}";
        assertEquals(false, test.isValid(s));
    }
}
