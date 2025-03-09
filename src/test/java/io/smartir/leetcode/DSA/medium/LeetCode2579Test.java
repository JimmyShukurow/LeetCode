package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode2579Test {

    @Test
    void coloredCells() {
        //given
        LeetCode2579 underTest = new LeetCode2579();
        int n = 1;
        //when
        long result = underTest.coloredCells(n);
        //then
        assertThat(result).isEqualTo(1);
    }
    @Test
    void coloredCells2() {
        //given
        LeetCode2579 underTest = new LeetCode2579();
        int n = 2;
        //when
        long result = underTest.coloredCells(n);
        //then
        assertThat(result).isEqualTo(5);
    }
    @Test
    void coloredCells3() {
        //given
        LeetCode2579 underTest = new LeetCode2579();
        int n = 3;
        //when
        long result = underTest.coloredCells(n);
        //then
        assertThat(result).isEqualTo(13);
    }
}