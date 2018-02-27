package com.hazza.LeetCodeByJava.SegmentTwoTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No126WordLadderII;
import com.hazza.LeetCodeByJava.util.Utils;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-27
 * Time: 2:02 PM
 */
public class No126Test {
    No126WordLadderII test;

    @Before
    public void setUp() {
        test = new No126WordLadderII();
    }

    @Test
    public void test() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        String beginWord = "hit";
        String endWord = "cog";

        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("hit", "hot", "dot", "dog", "cog"));
        expected.add(Arrays.asList("hit", "hot", "lot", "log", "cog"));

        Collections.sort(expected, new Utils.doubleListComp());
        List<List<String>> res = test.findLadders(beginWord, endWord, wordList);
        Collections.sort(res, new Utils.doubleListComp());

        assertEquals(Utils.doubleList2Str(expected), Utils.doubleList2Str(res));
    }
}
