package com.hazza.LeetCodeByJava.SegmentOneTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No51NQueens;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hazza on 8/3/17.
 */
public class No51Test {
    No51NQueens test;

    private String printListList(List<List<String>> lists) {
        StringBuilder sb = new StringBuilder();
        for (List<String> l: lists)
            for (String s: l)
                sb.append(s);
        return sb.toString();
    }


    @Before
    public void setUp() {
        test = new No51NQueens();
    }

    @Test
    public void testFourQueens() {
        List<List<String>> righgList = new ArrayList<>();
        righgList.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        righgList.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        String right = printListList(righgList);
        for (List<String> l: test.solveNQueens(4)) {
            for (String s : l)
                System.out.println(s);
            System.out.println();
        }
        String res = printListList(test.solveNQueens(4));
        assertEquals(right, res);
    }
}
