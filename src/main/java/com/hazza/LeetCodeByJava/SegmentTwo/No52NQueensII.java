package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/n-queens-ii/description/
 */
public class No52NQueensII {
    // solution 1
    public int totalNQueens(int n) {
        return dfs(n, 0 , new HashSet<Integer>(), new HashSet<Integer>(), new HashSet<Integer>());
    }

    private int dfs(int n, int row,
                     Set<Integer> xySum, Set<Integer> xyDif, Set<Integer> queens) {
        int count = 0;
        if (row == n) return 1;
        for (int col = 0; col < n; ++col) {
            if (!queens.contains(col) && !xyDif.contains(row - col) && !xySum.contains(row + col)) {
                xySum.add(row + col);
                xyDif.add(row - col);
                queens.add(col);
                count += dfs(n, row + 1, xySum, xyDif, queens);
                xySum.remove(row + col);
                xyDif.remove(row - col);
                queens.remove(col);
            }
        }

        return count;
    }

    // solution 2
    public int totalNQueens1(int n) {
        return dfs1(n, 0, new boolean[n], new boolean[n * 2], new boolean[n * 2]);
    }

    private int dfs1(int n, int row, boolean[] queens, boolean[] xySum, boolean xyDif[]) {
        int count = 0;
        if (row == n) return 1;
        for (int col = 0; col < n; ++col) {
            if (!queens[col] && !xySum[row +col] && !xyDif[n + row - col]) {
                queens[col] = true;
                xySum[row +col] = true;
                xyDif[n + row - col] = true;
                count += dfs1(n, row + 1, queens, xySum, xyDif);
                queens[col] = false;
                xySum[row +col] = false;
                xyDif[n + row - col] = false;
            }
        }
        return count;
    }


}
