package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentOne.No32AddToListLongestValidParentheses;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 8/6/17.
 */
public class No32Test {
    No32AddToListLongestValidParentheses test;

    private String createRandomParens(int len) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int choice = random.nextInt(2);
            switch (choice) {
                case 0:
                    sb.append("(");
                    break;
                case 1:
                    sb.append(")");
                    break;
            }
        }

        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No32AddToListLongestValidParentheses();
    }

    @Test
    public void testTwo() {
        String str1 = "())";
        String str2 = "()(()";
        assertEquals(2, test.longestValidParentheses(str1));
        assertEquals(2, test.longestValidParentheses(str2));
    }

    @Test
    public void testFour() {
        String str = ")()())";
        assertEquals(4, test.longestValidParentheses(str));
    }

    @Test
    public void testRandom() {
        String str = createRandomParens(20);
        System.out.println(str);
        System.out.println(test.longestValidParentheses(str));
    }
}
