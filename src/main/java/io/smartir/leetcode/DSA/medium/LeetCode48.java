package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode48 {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int m = 0, n = 0;
        while (m <= length/2){
            int temp = matrix[m][n];
            int i = m, j = n;
            while (true){
                int tempX = i;
                i = j;
                j = length - 1 - tempX;
                if(i==m && j ==n) {
                    matrix[i][j] = temp;
                    break;
                }
                int innerTemp = matrix[i][j];
                matrix[i][j] = temp;
                temp = innerTemp;
            }
            n++;
            if (n>length-m-2){
                m++;
                n = m;
            }
            if (length %2 ==1 &&  m>=length/2 && n>=length/2) break;
            if (length %2 == 0 &&  m>=length/2-1 && n>=length/2) break;
        }
        displayMatrix(matrix);
        System.out.println("--------------------------");
    }

    public void displayMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
