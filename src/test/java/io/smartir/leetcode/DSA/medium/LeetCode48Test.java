package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode48Test {

    @Test
    public void rotate() {
        //given
        LeetCode48 test = new LeetCode48();
        int[][] given = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //when
      test.rotate(given);

        //then
    }
    @Test
    public void rotate2() {
        //given
        LeetCode48 test = new LeetCode48();
        int[][] given = {
                {5 , 1, 9,11},
                {2 , 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };

        //when
      test.rotate(given);

        //then
    }
    @Test
    public void rotate3() {
        //given
        LeetCode48 test = new LeetCode48();
        int[][] given = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        //when
        test.rotate(given);

        //then
    }
}