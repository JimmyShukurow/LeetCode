package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode452Test {

    @Test
    void findMinArrowShots() {
        //given
        LeetCode452 underTest = new LeetCode452();
        int[][] given = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        //when
        int result = underTest.findMinArrowShots(given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    void findMinArrowShots2() {
        //given
        LeetCode452 underTest = new LeetCode452();
        int[][] given = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        //when
        int result = underTest.findMinArrowShots(given);
        //then
        assertThat(result).isEqualTo(4);
    }
    @Test
    void findMinArrowShots3() {
        //given
        LeetCode452 underTest = new LeetCode452();
        int[][] given = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        //when
        int result = underTest.findMinArrowShots(given);
        //then
        assertThat(result).isEqualTo(2);
    }
}