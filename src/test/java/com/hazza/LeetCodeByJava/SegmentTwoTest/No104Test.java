package com.hazza.LeetCodeByJava.SegmentTwoTest;

import com.hazza.LeetCodeByJava.SegmentTwo.No103BinaryTreeZigzagLevelOrderTraversal;
import com.hazza.LeetCodeByJava.SegmentTwo.No104MaximumDepthOfBinaryTree;
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
public class No104Test {
    No104MaximumDepthOfBinaryTree test;

    @Before
    public void setUp() {
        test = new No104MaximumDepthOfBinaryTree();
    }

    @Test
    public void testZigzag() {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};
        TreeNode root = TreeNode.createBinTree(pre, in);
        TreeNode.printTree(root, 0);

        assertEquals(3, test.maxDepth(root));
    }
}
