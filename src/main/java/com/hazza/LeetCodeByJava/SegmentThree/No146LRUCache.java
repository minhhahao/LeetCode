package com.hazza.LeetCodeByJava.SegmentThree;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/lru-cache/description/
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-26
 * Time: 上午9:02
 */

public class No146LRUCache {

    class LRUCache {
        private Map<Integer, DoubleLinkedNode> cache;
        private int capacity;
        private DoubleLinkedNode head, tail;

        public LRUCache(int capacity) {
            cache = new HashMap<>(capacity);
            this.capacity = capacity;
            head = null;
            tail = null;
        }

        public int get(int key) {
            if (!cache.containsKey(key)) {
                return -1;
            } else {
                DoubleLinkedNode node = cache.get(key);
                node.update();
                return node.value;
            }
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                DoubleLinkedNode node = cache.get(key);
                node.value = value;
                node.update();
            } else {
                if (capacity == 0) {
                    return;
                }
                if (capacity == cache.size()) {
                    cache.remove(head.key);
                    head.removeFromHead();
                }
                DoubleLinkedNode newNode = new DoubleLinkedNode(key, value);
                newNode.append();
                cache.put(key, newNode);
            }
        }

        class DoubleLinkedNode {
            int key;
            int value;
            DoubleLinkedNode left, right;

            public DoubleLinkedNode(int key, int value) {
                this.key = key;
                this.value = value;
                left = null;
                right = null;
            }

            private void removeFromHead() {
                // only have one node
                if (tail == this) {
                    head = null;
                    tail = null;
                } else {
                    head = this.right;
                    head.left = null;
                }
            }

            private void update() {
                // access the the latest node
                if (tail == this) {
                    return;
                } else {
                    if (head == this) {
                        head = this.right;
                    } else {
                        this.left.right = this.right;
                    }
                    this.right.left = this.left;
                    this.append();
                }
            }

            private void append() {
                // have none node
                if (tail == null) {
                    head = this;
                    tail = this;
                } else {
                    this.right = null;
                    this.left = tail;
                    tail.right = this;
                    tail = this;
                }
            }
        }
    }
}
