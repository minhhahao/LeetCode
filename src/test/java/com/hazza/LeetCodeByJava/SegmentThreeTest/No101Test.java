package com.hazza.LeetCodeByJava.SegmentThreeTest;

import com.hazza.LeetCodeByJava.SegmentThree.No101SymmetricTree;
import com.hazza.LeetCodeByJava.datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 17-11-22
 * Time: 6:26 PM
 */
public class No101Test {
    No101SymmetricTree test = new No101SymmetricTree();

    @Before
    public void setUp() {
        test = new No101SymmetricTree();
    }

    @Test
    public void testSymmetricTree() {
        int[] pre = {1, 2, 3, 4, 2, 4, 3};
        int[] in = {3, 2, 4, 1, 4, 2, 3};

        TreeNode root = TreeNode.createBinTree(pre, in);
        TreeNode.printTree(root, 0);

        assertTrue(test.isSymmetric(root));
        assertEquals(test.isSymmetric(root), test.isSymmetric1(root));
    }

    @Test
    public void testNonSymmetriTree() {
        int[] pre = {1, 2, 3, 2, 3};
        int[] in = {2, 3, 1, 2, 3};

        TreeNode root = TreeNode.createBinTree(pre, in);
        TreeNode.printTree(root, 0);

        assertEquals(test.isSymmetric(root), test.isSymmetric1(root));
    }
}