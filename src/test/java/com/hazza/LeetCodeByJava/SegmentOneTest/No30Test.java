package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No30SubstringWithConcatenationOfAllWords;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/16/17.
 */
public class No30Test {
    @Test
    public void testSingle() {
        No30SubstringWithConcatenationOfAllWords test = new No30SubstringWithConcatenationOfAllWords();
        String s = "a";
        String[] words = {"a"};
        List<Integer> right = Arrays.asList(0);
        List<Integer> res = test.findSubstring(s, words);
        assertEquals(right, res);
    }

    @Test
    public void testNonDuplicates() {
        No30SubstringWithConcatenationOfAllWords test = new No30SubstringWithConcatenationOfAllWords();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> right = Arrays.asList(0, 9);
        List<Integer> res = test.findSubstring(s, words);
        assertEquals(right, res);
    }

    @Test
    public void testEnd() {
        No30SubstringWithConcatenationOfAllWords test = new No30SubstringWithConcatenationOfAllWords();
        String s = "barfoofoobar";
        String[] words = {"foo", "bar"};
        List<Integer> right = Arrays.asList(0, 6);
        List<Integer> res = test.findSubstring(s, words);
        assertEquals(right, res);
    }

    @Test
    public void testDuplicates() {
        No30SubstringWithConcatenationOfAllWords test = new No30SubstringWithConcatenationOfAllWords();
        String s = "barfoofoothefoobarmanbarfoofoo";
        String[] words = {"foo", "foo", "bar"};
        List<Integer> right = Arrays.asList(0, 21);
        List<Integer> res = test.findSubstring(s, words);
        assertEquals(right, res);
    }

    @Test
    public void testLapped() {
        No30SubstringWithConcatenationOfAllWords test = new No30SubstringWithConcatenationOfAllWords();
        String s = "barfoofoobarthefoobarman";
        String[] words = {"the", "foo", "bar"};
        List<Integer> right = Arrays.asList(6, 9, 12);
        List<Integer> res = test.findSubstring(s, words);
        assertEquals(right, res);
    }
}
