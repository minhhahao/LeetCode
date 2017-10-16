package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentOne.No46Permutations;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 7/29/17.
 */
public class No46Test {
    No46Permutations test;

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
        test = new No46Permutations();
    }

    @Test
    public void testTherr() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> right = new ArrayList<>();
        right.add(Arrays.asList(1, 2, 3));
        right.add(Arrays.asList(1, 3, 2));
        right.add(Arrays.asList(2, 1, 3));
        right.add(Arrays.asList(2, 3, 1));
        right.add(Arrays.asList(3, 1, 2));
        right.add(Arrays.asList(3, 2, 1));

        String rightStr = outPutListList(right);
        String res = outPutListList(test.permute(nums));
        assertEquals(rightStr, res);
    }
}
