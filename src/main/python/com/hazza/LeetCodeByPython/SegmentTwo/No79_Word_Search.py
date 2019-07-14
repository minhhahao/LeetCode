#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Created by HazzaCheng on 2019-07-14
# https://leetcode.com/problems/word-search/
from typing import List


class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def dfs(i, j, cur, used):
            if cur == len(word):
                return True

            if i < 0 or i >= len(board) \
                    or j < 0 or j >= len(board[0]) \
                    or used[i][j] or word[cur] != board[i][j]:
                return False

            used[i][j] = True
            res = dfs(i - 1, j, cur + 1, used) or \
                dfs(i + 1, j, cur + 1, used) or \
                dfs(i, j - 1, cur + 1, used) or \
                dfs(i, j + 1, cur + 1, used)
            used[i][j] = False

            return res

        used = [[False] * len(board[0]) for _ in range(len(board))]

        for i in range(len(board)):
            for j in range(len(board[0])):
                if dfs(i, j, 0, used):
                    return True

        return False


if __name__ == '__main__':
    solution = Solution()

    board = [
        ['A', 'B', 'C', 'E'],
        ['S', 'F', 'C', 'S'],
        ['A', 'D', 'E', 'E']
    ]

    assert solution.exist(board, 'ABCCED') == True
    assert solution.exist(board, 'SEE') == True
    assert solution.exist(board, 'ABCB') == False
