package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode56Test {

    @Test
    public void merge() {
        //given
        LeetCode56 test = new LeetCode56();
        int[][] given = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        //when
        test.merge(given);
        //then
    }
    @Test
    public void merge2() {
        //given
        LeetCode56 test = new LeetCode56();
        int[][] given = {{1, 4}, {5, 8}};
        //when
        test.merge(given);
        //then
    }
    @Test
    public void merge3() {
        //given
        LeetCode56 test = new LeetCode56();
        int[][] given = {{1, 4}, {0, 4}};
        //when
        test.merge(given);
        //then
    }
}