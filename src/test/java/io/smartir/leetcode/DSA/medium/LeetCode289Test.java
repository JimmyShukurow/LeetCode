package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode289Test {

    @Test
    public void gameOfLife() {
        //given
        LeetCode289 test = new LeetCode289();
        int[][] given = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        //when
        test.gameOfLife(given);

        //then
    }
    @Test
    public void gameOfLife2() {
        //given
        LeetCode289 test = new LeetCode289();
        int[][] given = {
                {1, 1},
                {1, 0},
        };
        //when
        test.gameOfLife(given);

        //then
    }
}