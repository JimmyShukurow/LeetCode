package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode52Test {

    @Test
    void totalNQueens() {

        //given
        LeetCode52 underTest = new LeetCode52();
        int n = 4;
        //when
        var result = underTest.totalNQueens(n);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    void totalNQueens2() {

        //given
        LeetCode52 underTest = new LeetCode52();
        int n = 1;
        //when
        var result = underTest.totalNQueens(n);
        //then
        assertThat(result).isEqualTo(1);
    }
    @Test
    void totalNQueens3() {

        //given
        LeetCode52 underTest = new LeetCode52();
        int n = 5;
        //when
        var result = underTest.totalNQueens(n);
        //then
        assertThat(result).isEqualTo(10);
    }

}