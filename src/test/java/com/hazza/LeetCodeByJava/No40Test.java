package com.hazza.LeetCodeByJava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/24/17.
 */
public class No40Test {
    No40CombinationSumII test;

    private String outPutListList(List<List<Integer>> list) {
        StringBuilder sb = new StringBuilder();
        List<Integer> temp = new ArrayList<>();
        for (List<Integer> l: list) {
            for (Integer i: l) temp.add(i);
        }
        Collections.sort(temp);
        for (Integer i: temp) sb.append(i);

        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No40CombinationSumII();
    }

    @Test
    public void testSingleOne() {
        int[] candidates = {1};
        List<List<Integer>> right = new ArrayList<>();
        right.add(Arrays.asList(1));
        String rightStr = outPutListList(right);
        String answer = outPutListList(test.combinationSum2(candidates, 1));

        assertEquals(rightStr, answer);
    }

    @Test
    public void testManyOne() {
        int[] candidates = {1};
        List<List<Integer>> right = new ArrayList<>();
        String answer = outPutListList(test.combinationSum2(candidates, 5));

        assertEquals("", answer);
    }

    @Test
    public void testMany() {
        int[] candidates = {10,1,2,7,6,1,5};
        List<List<Integer>> right = new ArrayList<>();
        right.add(Arrays.asList(1, 1, 6));
        right.add(Arrays.asList(1, 2, 5));
        right.add(Arrays.asList(1, 7));
        right.add(Arrays.asList(2, 6));
        String rightStr = outPutListList(right);
        String answer = outPutListList(test.combinationSum2(candidates, 8));

        assertEquals(rightStr, answer);
    }
}
