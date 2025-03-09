package io.smartir.leetcode.DSA.easy;

import java.util.ArrayList;
import java.util.List;

public class LetCode2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> nums = new ArrayList<>();
        int[] result = new int[2];
        int n = grid.length;
        int extraSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums.contains(grid[i][j])) {
                    result[0] = grid[i][j];
                } else {
                    nums.add(grid[i][j]);
                    extraSum += grid[i][j];
                }
            }
        }
        int m = n * n;
        int sum = m * (m + 1) / 2;
        int b = sum - extraSum;
        result[1] = b;
        return result;
    }
}
