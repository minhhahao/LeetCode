package com.hazza.LeetCodeByJava.SegmentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/gas-station/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-8
 * Time: 10:25 AM
 */
public class No134GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int total = 0, tank = 0, start = 0;

        for (int i = 0; i < len; i++)
            if ((tank += gas[i] - cost[i]) < 0) {
                start = i + 1;
                total += tank;
                tank = 0;
            }

        return (tank + total < 0) ? -1 : start;
    }
}
