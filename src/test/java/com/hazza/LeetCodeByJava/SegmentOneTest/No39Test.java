package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No39CombinationSum;
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
public class No39Test {
    No39CombinationSum test;

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
        test = new No39CombinationSum();
    }

    @Test
    public void testOne() {
        int[] candidates = {1};
        List<List<Integer>> right = new ArrayList<>();
        right.add(Arrays.asList(1, 1, 1, 1, 1));
        String rightStr = outPutListList(right);
        String answer = outPutListList(test.combinationSum(candidates, 5));

        assertEquals(rightStr, answer);
    }

    @Test
    public void testMany() {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> right = new ArrayList<>();
        right.add(Arrays.asList(2, 2, 3));
        right.add(Arrays.asList(7));
        String rightStr = outPutListList(right);
        String answer = outPutListList(test.combinationSum(candidates, 7));

        assertEquals(rightStr, answer);
    }
}
