package com.hazza.leetcode.SegmentOneTest;

import com.hazza.leetcode.SegmentTwo.No94BinaryTreeInorderTraversal;
import com.hazza.leetcode.datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-09
 * Time: 9:36 AM
 */
public class No94Test {
    No94BinaryTreeInorderTraversal test;

    private String intList2str(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for (int l: list) sb.append(l + " ");
        return sb.toString();
    }

    @Before
    public void setUp() {
        test = new No94BinaryTreeInorderTraversal();
    }

    @Test
    public void testComplexed() {
        int[] preOrder = {1, 2, 4, 8, 9, 5, 3, 6, 7, 10, 11};
        int[] inOrder = {8, 4, 9, 2, 5, 1, 6, 3, 10, 11, 7};
        TreeNode root = TreeNode.createBinTree(preOrder, inOrder);
        TreeNode.printTree(root, 1);
        String expected = "8 4 9 2 5 1 6 3 10 11 7 ";
        String res = intList2str(test.inorderTraversal(root));
        assertEquals(expected, res);
    }
}
