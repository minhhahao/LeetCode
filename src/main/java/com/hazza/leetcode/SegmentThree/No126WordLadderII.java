package com.hazza.leetcode.SegmentThree;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/word-ladder-ii/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-2-27
 * Time: 1:39 PM
 */
public class No126WordLadderII {

    private boolean isOneDiff(String w1, String w2) {
        int len = w1.length();
        boolean find = false;
        for (int i = 0; i < len; i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                if (find) return false;
                find = true;
            }
        }

        return find;
    }

    private List<String> getNeighbours(String word, List<String> words) {
        List<String> neighbours = new ArrayList<>();

        for (String w: words)
            if (isOneDiff(w, word)) neighbours.add(w);

        return neighbours;
    }

    private void bfs(Map<String, Integer> distance,
                     Map<String, List<String>> neighbours,
                     List<String> words,
                     String start, String end) {
        for (String word: words) neighbours.put(word, new ArrayList<>());
        Queue<String> queue = new LinkedList<>();
        
        // add the start word
        queue.add(start);
        distance.put(start, 0);
        
        while (!queue.isEmpty()) {
            boolean found = false;
            int count = queue.size();

            for (int i = 0; i < count; i++) {
                String cur = queue.poll();
                int curDistance = distance.get(cur);
                List<String> curNeighbours = getNeighbours(cur, words);
                neighbours.put(cur, curNeighbours);
                // get next level
                for (String neighbour: curNeighbours) {
                    if (!distance.containsKey(neighbour)) {
                        distance.put(neighbour, curDistance + 1);
                        if (neighbour.equals(end)) found = true;
                        else queue.add(neighbour);
                    }
                }
            }

            if (found) break;
        }
    }

    private void dfs(List<List<String>> res,
                     Map<String, Integer> distance,
                     Map<String, List<String>> neighbours,
                     List<String> path,
                     String cur, String end) {
        path.add(cur);
        if (!cur.equals(end)) {
            for (String neighbour: neighbours.get(cur)) {
                if (distance.get(neighbour) == distance.get(cur) + 1)
                    dfs(res, distance, neighbours, path, neighbour, end);
            }
        } else res.add(new ArrayList<>(path));
        path.remove(path.size() - 1);
    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> distance = new HashMap<>();
        Map<String, List<String>> neighbours = new HashMap<>();
        List<String> path = new ArrayList<>();

        bfs(distance, neighbours, wordList, beginWord, endWord);
        dfs(res, distance, neighbours, path, beginWord, endWord);

        return res;
    }
}
