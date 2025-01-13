package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode73 {
    public void setZeroes(int[][] matrix) {
        int m = 0, n = 0;
        List<int[]> cordiantes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) cordiantes.add(new int[]{i, j});
            }
        }
        cordiantes.forEach(el-> System.out.println("cordiantes => " + Arrays.toString(el)));
        for (int[] cordiante : cordiantes) {
            int a = cordiante[0];
            int b = cordiante[1];
            int k = a;
            int l = b;
            while (k >= 0) {
                matrix[k][b] = 0;
                k--;
            }
            k = a;
            while (k < matrix.length) {
                matrix[k][b] = 0;
                k++;
            }
            while (l >= 0) {
                matrix[a][l] = 0;
                l--;
            }
            l = b;
            while (l < matrix[0].length) {
                matrix[a][l] = 0;
                l++;
            }
        }
        displayMatrix(matrix);
    }
    public void displayMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
//

}

