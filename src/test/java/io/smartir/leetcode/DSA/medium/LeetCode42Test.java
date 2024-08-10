package io.smartir.leetcode.DSA.medium;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode42Test {

    @Test
    public void trap() {
        //given
        LeetCode42 test = new LeetCode42();
        int[] given = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //when
        var result = test.trap(given);
        //then
        assertThat(result).isEqualTo(6);
    }
    @Test
    public void trap2() {
        //given
        LeetCode42 test = new LeetCode42();
        int[] given = {4,2,0,3,2,5};
        //when
        var result = test.trap(given);
        //then
        assertThat(result).isEqualTo(9);
    }
}