package com.hazza.LeetCodeByJava.SegmentTwo;

import com.hazza.LeetCodeByJava.datastructure.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/copy-list-with-random-pointer/discuss/43488/Java-O(n)-solution
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-16
 * Time: 10:09 PM
 */
public class No138CopyListWithRandomPointer {

    // solution 1
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode node = head;

        // get all copy of nodes
        while (node != null) {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }

    // solution 2
    public RandomListNode copyRandomList1(RandomListNode head) {
        RandomListNode iter = head, next;

        // Copy next node, and the copy node is behind the node which it copies.
        while (iter != null) {
            next = iter.next;
            RandomListNode copy = new RandomListNode(iter.label);
            iter.next = copy;
            copy.next = next;
            iter = next;
        }

        // Copy the random node.
        iter = head;
        while (iter != null) {
            next = iter.next.next;
            if (iter.random != null)
                iter.next.random = iter.random.next;
            iter = next;
        }

        // Restore the original nodes and extract the copy nodes.
        iter = head;
        RandomListNode temp = new RandomListNode(0);
        RandomListNode copy, copyIter = temp;
        while (iter != null) {
            next = iter.next.next;
            // extract the copy node
            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;
            // restore original node
            iter.next = next;

            iter = next;
        }

        return temp.next;
    }

}