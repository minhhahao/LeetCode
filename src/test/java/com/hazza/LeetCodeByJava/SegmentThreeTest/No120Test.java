package com.hazza.LeetCodeByJava.SegmentThreeTest;

import com.hazza.LeetCodeByJava.SegmentThree.No120Triangle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-2
 * Time: 下午5:46
 */
public class No120Test {
    No120Triangle test;

    @Before
    public void setUp() {
        test = new No120Triangle();
    }

    @Test
    public void test1() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        assertEquals(11, test.minimumTotal(triangle));
        assertEquals(11, test.minimumTotal1(triangle));
    }
}
