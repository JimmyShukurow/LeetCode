package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode73Test {

    @Test
    public void setZeroes() {
        //given
        LeetCode73 test = new LeetCode73();
        int[][] given = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        //when
        test.setZeroes(given);
        //then
    }
    @Test
    public void setZeroes2() {
        //given
        LeetCode73 test = new LeetCode73();
        int[][] given = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        //when
        test.setZeroes(given);
        //then
    }
    @Test
    public void setZeroes3() {
        //given
        LeetCode73 test = new LeetCode73();
        int[][] given = {{0,1}};
        //when
        test.setZeroes(given);
        //then
    }

}