package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No77Combinations;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-08-30
 * Time: 7:33 PM
 */
public class No77Test {
    No77Combinations test;

    private String list2str(List<List<Integer>> lists) {
        StringBuilder sb = new StringBuilder();
        for (List<Integer> list: lists) {
            for (Integer i : list) sb.append(i + " ");
            sb.append("|");
        }
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No77Combinations();
    }

    @Test
    public void testMany() {
        List<List<Integer>> right = new ArrayList<>();
        right.add(Arrays.asList(1, 2));
        right.add(Arrays.asList(1, 3));
        right.add(Arrays.asList(1, 4));
        right.add(Arrays.asList(2, 3));
        right.add(Arrays.asList(2, 4));
        right.add(Arrays.asList(3, 4));
        assertEquals(list2str(right), list2str(test.combine(4, 2)));
    }
}
