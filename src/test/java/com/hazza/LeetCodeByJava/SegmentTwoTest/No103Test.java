package com.hazza.LeetCodeByJava.SegmentTwoTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No103BinaryTreeZigzagLevelOrderTraversal;
import com.hazza.LeetCodeByJava.datastructure.TreeNode;
import com.hazza.LeetCodeByJava.util.Utils;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-15
 * Time: 5:03 PM
 */
public class No103Test {
    No103BinaryTreeZigzagLevelOrderTraversal test;

    @Before
    public void setUp() {
        test = new No103BinaryTreeZigzagLevelOrderTraversal();
    }

    @Test
    public void testZigzag() {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};
        TreeNode root = TreeNode.createBinTree(pre, in);
        TreeNode.printTree(root, 0);

        String expected = "3 20 9 15 7 ";
        List<List<Integer>> res = test.zigzagLevelOrder(root);
        List<List<Integer>> res1 = test.zigzagLevelOrder1(root);
        String ans = Utils.doubleList2Str(res);
        String ans1 = Utils.doubleList2Str(res1);

        assertEquals(expected, ans);
    }
}
