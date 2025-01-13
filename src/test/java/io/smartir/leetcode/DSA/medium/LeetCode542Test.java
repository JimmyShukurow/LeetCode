package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode542Test {

    @Test
    public void updateMatrix() {
        //given
        LeetCode542 underTest = new LeetCode542();
        int[][] given = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        //when
        var result = underTest.updateMatrix(given);
        //then
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
    @Test
    public void updateMatrix2() {
        //given
        LeetCode542 underTest = new LeetCode542();
        int[][] given = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        //when
        var result = underTest.updateMatrix(given);
        //then
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
}