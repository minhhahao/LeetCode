import com.hazza.LeetCodeByJava.No84LargestRectangleInHistogram;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-09-07
 * Time: 6:44 PM
 */
public class No84Test {
    No84LargestRectangleInHistogram test;

    private int[] creatRandomNums(int len) {
        int[] res = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) res[i] = random.nextInt(100) + 1;
        return res;
    }

    @Before
    public void setUp() {
        test = new No84LargestRectangleInHistogram();
    }

    @Test
    public void testShort() {
        int[] heights = {1, 1, 1, 1, 1};
        assertEquals(5, test.largestRectangleArea(heights));
        assertEquals(5, test.largestRectangleArea1(heights));
    }

    @Test
    public void testFixed1() {
        int[] heights = {6, 2, 5, 4, 5, 2, 1};
        assertEquals(12, test.largestRectangleArea(heights));
        assertEquals(12, test.largestRectangleArea1(heights));
    }

    @Test
    public void testFixed2() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        assertEquals(10, test.largestRectangleArea(heights));
        assertEquals(10, test.largestRectangleArea1(heights));
    }

    @Test
    public void testRandom() {
        int[] heights = creatRandomNums(100);
        assertEquals(test.largestRectangleArea(heights), test.largestRectangleArea1(heights));
    }
}
