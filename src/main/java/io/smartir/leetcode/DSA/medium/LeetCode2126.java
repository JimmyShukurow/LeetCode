package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        long massLong = mass;
        Arrays.sort(asteroids);
        for (int asteroid : asteroids) {
            if (massLong < asteroid) return false;
            massLong += asteroid;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode2126 test = new LeetCode2126();
        System.out.println(test.asteroidsDestroyed(10, new int[]{3, 9, 19, 5, 21}));
        System.out.println(test.asteroidsDestroyed(5, new int[]{4, 9, 23, 4}));
    }
}
