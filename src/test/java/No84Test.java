import com.hazza.LeetCodeByJava.No84LargestRectangleInHistogram;
import org.junit.Before;
import org.junit.Test;

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

    @Before
    public void setUp() {
        test = new No84LargestRectangleInHistogram();
    }

    @Test
    public void test1() {
        int[] heights = {6, 2, 5, 4, 5, 2, 6};
        assertEquals(12, test.largestRectangleArea(heights));
    }

    @Test
    public void test2() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        assertEquals(10, test.largestRectangleArea(heights));
    }
}
