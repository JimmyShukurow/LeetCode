package io.smartir.leetcode.DSA.medium;

public class LeetCode2379 {
    public int minimumRecolors(String blocks, int k) {
        int minWhites = 100;
        for (int i = 0; i < blocks.length() - k+1; i++) {
            int whites = 0;
            for (int j = 0; j < k; j++) {
                if (blocks.charAt(i+j) == 'W') whites++;
            }
            if (whites == 0) return 0;
            else {
                if (minWhites > whites) minWhites = whites;
            }
        }
        return minWhites;
    }
}
