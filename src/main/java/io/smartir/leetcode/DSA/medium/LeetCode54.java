package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int counter = matrix.length * matrix[0].length;
        if (matrix.length ==1){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    result.add(matrix[i][j]);

                }
            }
            return result;
        }
        if (matrix[0].length ==1){
            for (int i = 0; i < matrix.length ; i++) {
                result.add(matrix[i][0]);
            }
            return result;
        }
        int m = 0, n = 0;
        result.add(matrix[m][n]);
        matrix[m][n] = 1000;
        n++;
        result.add(matrix[m][n]);
        matrix[m][n] = 1000;
        counter--;
        while (counter > 0) {
            while (n < matrix[0].length - 1 && matrix[m][n + 1] <= 100) {
                n++;
                result.add(matrix[m][n]);
                matrix[m][n] = 1000;
                counter--;

            }
            while (m < matrix.length - 1 && matrix[m + 1][n] <= 100) {
                m++;
                result.add(matrix[m][n]);
                matrix[m][n] = 1000;
                counter--;
            }
            while (n > 0 && matrix[m][n - 1] <= 100) {
                n--;
                result.add(matrix[m][n]);
                matrix[m][n] = 1000;
                counter--;
            }
            while (m > 0 && matrix[m - 1][n] <= 100) {
                m--;
                result.add(matrix[m][n]);
                matrix[m][n] = 1000;
                counter--;
            }
            counter--;
        }
        return result;
    }
}
