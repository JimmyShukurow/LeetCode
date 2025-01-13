package io.smartir.leetcode.DSA.easy;

import java.util.Arrays;

public class Test {
    public static int[] squareArray(int[] given) {

        int left = 0;
        int right = given.length - 1;
        int[] result = new int[given.length];
        int index = given.length - 1;
        while (left <= right) {
            if (Math.abs(given[left]) > Math.abs(given[right])) {
                result[index] = given[left] * given[left];
                left++;
            } else {
                result[index] = given[right] * given[right];
                right--;
            }
            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] given = {-3, 2, 4};

        System.out.println(Arrays.toString(squareArray(given)));
    }
}
