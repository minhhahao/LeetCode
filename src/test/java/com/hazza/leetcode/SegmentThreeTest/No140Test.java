package com.hazza.leetcode.SegmentThreeTest;

import com.hazza.leetcode.SegmentThree.No140WordBreakII;
import com.hazza.leetcode.util.Utils;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-18
 * Time: 7:29 PM
 */
public class No140Test {
    No140WordBreakII test;

    @Before
    public void setUp() {
        test = new No140WordBreakII();
    }

    @Test
    public void test() {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> expected = Arrays.asList("cats and dog", "cat sand dog");
        List<String> ans = test.wordBreak(s, wordDict);

        assertEquals(Utils.list2Str(expected), Utils.list2Str(ans));
    }
}
