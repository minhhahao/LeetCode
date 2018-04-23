package com.hazza.LeetCodeByJava.SegmentFour;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/min-stack/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-23
 * Time: 8:46 AM
 */
public class No155MinStack {

    /**
     * Solution 1
     */
    public class MinStack {
        private final int SIZE = 100000;
        private int[] data;
        private int count;
        private int[] min;

        public MinStack() {
            data = new int[SIZE];
            count = -1;
            min = new int[SIZE];
            min[0] = Integer.MAX_VALUE;
        }

        public void push(int x) {
            data[++count] = x;
            min[count + 1] = Math.min(min[count], x);
        }

        public void pop() {
            --count;
        }

        public int top() {
            return data[count];
        }

        public int getMin() {
            return min[count + 1];
        }
    }

    /**
     * Solution 2
     */
    public class MinStack1 {
        private Deque<Long> stack;
        private long min;

        public MinStack1() {
            stack = new ArrayDeque<>();
        }

        public void push(int x) {
            if (stack.isEmpty()) {
                stack.push(0L);
                min = x;
            } else {
                stack.push(x - min);
                if (x < min) {
                    min = x;
                }
            }
        }

        public void pop() {
            if (stack.isEmpty()) {
                return;
            }
            long pop = stack.pop();
            if (pop < 0) {
                min -= pop;
            }
        }

        public int top() {
            long top = stack.peek();
            if (top > 0) {
                return (int) (top + min);
            } else {
                return (int) min;
            }
        }

        public int getMin() {
            return (int) min;
        }
    }

}
