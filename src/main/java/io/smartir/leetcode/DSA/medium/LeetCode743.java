package io.smartir.leetcode.DSA.medium;

import java.util.*;

public class LeetCode743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        int min = 0;
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] time : times) {
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.add(new int[]{0, k});
        Map<Integer, Integer> minTime = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            minTime.put(i, Integer.MAX_VALUE);
        }
        minTime.put(k, 0);
        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int time = top[0];
            int node = top[1];
            for (int[] neighbors : graph.get(node)) {
                int newTime = time + neighbors[1];
                if (newTime < minTime.get(neighbors[0])) {
                    minTime.put(neighbors[0], newTime);
                    minHeap.add(new int[]{newTime, neighbors[0]});
                }
            }
        }
        int maxTime = Collections.max(minTime.values());
        return maxTime == Integer.MAX_VALUE ? -1 : maxTime;
    }
}
