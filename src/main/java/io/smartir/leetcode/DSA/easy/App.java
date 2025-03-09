package io.smartir.leetcode.DSA.easy;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public interface App {
    public static void main(String[] args) throws IOException {
        fillArray(23);
    }

    public static void fillArray( int n){
        int sideLength = 0;
        while (sideLength*sideLength < n){
            sideLength++;
        }
        int[][] array = new int[sideLength][sideLength];
        int row = 0;
        int col = 0;
        for (int i = 1; i <= n; i++) {
            array[row][col] = i;
            if (col < sideLength - 1) {
                col++;
            } else  {
                row++;
                col = 0;
            }
        }
        displayArray(array);

    }

    public static void displayArray(int[][] array){
        int sideLength = array.length;
        for (int[] ints : array) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

}
