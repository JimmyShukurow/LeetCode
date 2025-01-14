package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode452 {
    public int findMinArrowShots(int[][] points) {
        sort(points);
        int arrows = 1;
        int prevEnd = points[0][1];

        // Count the number of non-overlapping intervals
        for (int i = 1; i < points.length; ++i) {
            if (points[i][0] > prevEnd) {
                arrows++;
                prevEnd = points[i][1];
            }
        }

        return arrows;
    }

    public void sort(int[][] points) {
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][0] > points[j][0]) {
                    int[] temp = points[i];
                    points[i] = points[j];
                    points[j] = temp;
                }
            }
        }
    }
}
