package com.hazza.LeetCodeByJava.SegmentTwoTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No126WordLadderII;
import com.hazza.LeetCodeByJava.SegmentTwo.No127WordLadder;
import com.hazza.LeetCodeByJava.util.Utils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-01
 * Time: 2:02 PM
 */
public class No127Test {
    No127WordLadder test;

    @Before
    public void setUp() {
        test = new No127WordLadder();
    }

    @Test
    public void test() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        String beginWord = "hit";
        String endWord = "cog";

        assertEquals(5, test.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void testNon() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        String beginWord = "hit";
        String endWord = "cog";

        assertEquals(0, test.ladderLength(beginWord, endWord, wordList));
    }
}
