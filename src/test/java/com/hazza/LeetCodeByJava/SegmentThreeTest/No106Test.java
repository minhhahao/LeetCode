package com.hazza.LeetCodeByJava.SegmentThreeTest;

import com.hazza.LeetCodeByJava.SegmentThree.No106ConstructBinaryTreeFromInorderAndPostorderTraversal;
import com.hazza.LeetCodeByJava.datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-18
 * Time: 2:50 PM
 */
public class No106Test {
    No106ConstructBinaryTreeFromInorderAndPostorderTraversal test;

    @Before
    public void setUp() {
        test = new No106ConstructBinaryTreeFromInorderAndPostorderTraversal();
    }

    @Test
    public void testBuild() {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};

        TreeNode expected = TreeNode.createBinTree(preorder, inorder);
        TreeNode res = test.buildTree(inorder, postorder);
        TreeNode res1 = test.buildTree1(inorder, postorder);
/*
        TreeNode.printTree(expected, 0);
        System.out.println();
        TreeNode.printTree(res, 0);
*/

        assertEquals(true, TreeNode.treeEqual(expected, res));
        assertEquals(true, TreeNode.treeEqual(expected, res1));
    }
}
