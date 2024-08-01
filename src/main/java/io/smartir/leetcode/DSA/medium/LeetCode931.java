package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode931 {
    public int minFallingPathSum(int[][] matrix) {
        int row = 1;
        while (row < matrix.length) {
            int column = 0;
            int tempMin = Integer.MAX_VALUE;
            while (column < matrix.length) {
                tempMin = Math.min(matrix[row - 1][column], tempMin);
                if(column>0) tempMin = Math.min(matrix[row - 1][column - 1], tempMin);
                if(column< matrix.length-1) tempMin = Math.min(matrix[row - 1][column + 1], tempMin);
                matrix[row][column] += tempMin;
                column++;
                tempMin = Integer.MAX_VALUE;
            }
            row++;
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

        int result = Integer.MAX_VALUE;

        for (int num : matrix[matrix.length-1]) {
            result = Math.min(result, num);
        }
        return result;
    }
}
