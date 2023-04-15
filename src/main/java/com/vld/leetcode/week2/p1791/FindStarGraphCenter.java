package com.vld.leetcode.week2.p1791;

import java.util.*;

public class FindStarGraphCenter {


    public int findCenterEfficient(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
            return edges[0][0];
        else
            return edges[0][1];
    }

    public int findCenter(int[][] edges) {
        List<Integer> elementsList = new ArrayList<>();
        Set<Integer> elementsSet = new HashSet<>();

        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                elementsList.add(edges[i][j]);
                elementsSet.add(edges[i][j]);
            }
        }

        int max = 0;
        Iterator<Integer> iter = elementsSet.iterator();
        Map<Integer, Integer> frequencies = new HashMap<>();

        while (iter.hasNext()) {
            int next = iter.next();
            frequencies.put(Collections.frequency(elementsList, next), next);
            if (Collections.frequency(elementsList, next) > max) {
                max = Collections.frequency(elementsList, next);
            }
        }
        return frequencies.get(max);
    }
}
