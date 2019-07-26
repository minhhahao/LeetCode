package com.hazza.leetcode.SegmentThree;

import com.hazza.leetcode.datastructure.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/clone-graph/description/
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-3-7
 * Time: 9:28 AM
 */
public class No133CloneGraph {

    // solution 1
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        return cloneNode(node, map);
    }

    private UndirectedGraphNode cloneNode(UndirectedGraphNode node,
                                          Map<Integer, UndirectedGraphNode> map) {
        if (node == null) return null;
        if (map.containsKey(node.label)) return map.get(node.label);

        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        map.put(newNode.label, newNode);
        for (UndirectedGraphNode temp: node.neighbors)
            newNode.neighbors.add(cloneNode(temp, map));

        return newNode;

    }

    // solution 2
    public UndirectedGraphNode cloneGraph1(UndirectedGraphNode node) {
        if (node == null) return null;
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        map.put(newNode.label, newNode);
        queue.add(node);

        while (!queue.isEmpty()) {
            UndirectedGraphNode temp = queue.poll();
            for (UndirectedGraphNode nb: temp.neighbors) {
                if (!map.containsKey(nb.label)) {
                    map.put(nb.label, new UndirectedGraphNode(nb.label));
                    queue.add(nb);
                }
                map.get(temp.label).neighbors.add(map.get(nb.label));
            }
        }

        return newNode;
    }
}
