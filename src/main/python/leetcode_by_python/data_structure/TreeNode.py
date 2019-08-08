#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-08-05


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


def printBinaryTree(root, depth):
    if root:
        print("Level {}: {}".format(depth, root.val))
        printBinaryTree(root.left, depth + 1)
        printBinaryTree(root.right, depth + 1)
    else:
        print("Level {}: None".format(depth))


def createBinaryTree(preOrder, inOrder):
    node = None

    if len(preOrder) > 0:
        node = TreeNode(preOrder[0])
        idx = inOrder.index(preOrder[0])
        node.left = createBinaryTree(preOrder[1:idx + 1], inOrder[0:idx])
        node.right = createBinaryTree(preOrder[idx + 1:], inOrder[idx + 1:])

    return node


def isBinaryEqual(n1, n2):
    if n1 is None ^ n2 is None:
        return False
    if not n1:
        return True

    return n1.val == n2.val and isBinaryEqual(n1.left, n2.left) and isBinaryEqual(n1.right, n2.right)