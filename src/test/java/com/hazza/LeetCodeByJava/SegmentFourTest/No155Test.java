package com.hazza.LeetCodeByJava.SegmentFourTest;

import com.hazza.LeetCodeByJava.SegmentFour.No155MinStack;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-23
 * Time: 8:53 AM
 */
public class No155Test {
    No155MinStack.MinStack test;

    @Before
    public void setUp() {
        No155MinStack temp = new No155MinStack();
        test = temp.new MinStack();
    }

    @Test
    public void test() {
        test.push(-2);
        test.push(0);
        test.push(-3);

        assertEquals(-3, test.getMin());
        test.pop();
        assertEquals(0, test.top());
        assertEquals(-2, test.getMin());
    }
}
