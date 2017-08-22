package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-22
 * Time: 9:29 AM
 */
public class No68Test {
    No68TextJustification test;

    private String list2str(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s: list) sb.append(s + "|");
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No68TextJustification();
    }

    @Test
    public void testEmpty() {
        String[] empty = {""};
        assertEquals("|", list2str(test.fullJustify(empty, 0)));
    }

    @Test
    public void testSingle() {
        List<String> words = Arrays.asList("a");
        assertEquals(list2str(words), list2str(test.fullJustify(new String[]{"a"}, 1)));
    }

    @Test
    public void testSimple() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> right = Arrays.asList("This    is    an", "example  of text", "justification.  ");
        assertEquals(list2str(right), list2str(test.fullJustify(words, 16)));
    }
}
