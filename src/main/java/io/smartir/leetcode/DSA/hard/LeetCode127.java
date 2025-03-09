package io.smartir.leetcode.DSA.hard;

import java.util.*;

public class LeetCode127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, Integer> map = new HashMap<>();
        boolean endWordPresent = false;
        for (String s : wordList) {
            map.put(s, -1);
            if (s.equals(endWord)) {
                endWordPresent = true;
            }
        }
        if (!endWordPresent) {
            return 0;
        }
        map.put(beginWord, 0);
        int length = 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            int numOfTransformations = map.get(curr);
            if (curr.equals(endWord)) {
                return numOfTransformations + 1;
            }

            for (String s : wordList) {
                if (map.get(s) == -1 && numOfDifferences(curr, s) == 1) {
                    map.put(s, numOfTransformations + 1);
                    queue.offer(s);
                }
            }
        }

        return length;
    }
    private int numOfDifferences(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int numOfDifferences = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (chars1[i] != chars2[i])
                numOfDifferences++;
        }
        return numOfDifferences;
    }
}
